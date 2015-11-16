package org.dimigo.thread;

import java.io.*;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ ServerThread2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */

public class ServerThread2 implements Runnable {
  
	// 클라이언트와의 통신을 위한 소켓
	private Socket connectionSocket;
	
	private final static String DEFAULT_FILE_NAME = "index.html";
	
	public ServerThread2(Socket connectionSocket) {		
		this.connectionSocket = connectionSocket;
	}
	  
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread start");
		
		// 클라이언트와 통신을 위한 입/출력 스트림을 생성한다.
	    try(BufferedReader in = new BufferedReader(
	    		new InputStreamReader(connectionSocket.getInputStream()));
	    	PrintWriter out = new PrintWriter(connectionSocket.getOutputStream(), true)) {
	    	
	    	// 클라이언트로의 메시지 중 첫번째 줄을 읽어들인다.
	    	String request = in.readLine();
	    	System.out.println("request message : " + request);
	    	
	    	// 파일명 얻기
	    	String[] requestArr = request.split(" ");
	    	String fileName = "";
	    	
	    	if(requestArr[1].equals("/")) {
	    		fileName = DEFAULT_FILE_NAME;
	    	} else {
	    		fileName += requestArr[1].substring(1);
	    	}
	    	System.out.println("file name : " + fileName);
	    	
	    	// 파일 입력 스트림 생성
	    	File file = new File("org/dimigo/thread/" + fileName);
	    	
	    	// 해당 파일이 존재하는 경우
	    	if(file.exists()) {
	    		/************************************
	    		 * 해당 파일로부터 내용을 읽어 response에 담기
	    		 ************************************/
				String line = "";
				StringBuffer sb = new StringBuffer();
				try (BufferedReader br = new BufferedReader(new FileReader(file))) {
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}
				}

				String response = sb.toString();
		    	
		    	System.out.println("response : [" + response + "]");
		    	
		    	// 정상적으로 처리가 되었음을 나타내는 200 코드를 출력한다.
		    	out.println("HTTP/1.1 200");
		    	out.println("Content-type: text/html");
		    	out.println("Content-length: " + response.length());
		    	// header부의 끝을 알리기 위해 한줄 띄기
		    	out.println("");
		    	out.println(response);		    	
	    	} else {
	    		// 상태 코드 404 : Not Found
	    		out.println("HTTP/1.1 404");
		    	out.println("Content-type: text/html");
		    	String response = "<html><head><title>My Web Server</title></head>" +
		    					  "<body><h1>" + fileName + " File Not Found</h1></body></html>";
		    	out.println("Content-length: " + response.length());
		    	// header부의 끝을 알리기 위해 한줄 띄기
		    	out.println("");
		    	out.println(response);
	    	}

	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	try {
				connectionSocket.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	System.out.println(Thread.currentThread().getName() + " thread end");
	    }
	}
}

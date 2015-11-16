package org.dimigo.thread;

import java.io.*;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ ServerThread3
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class ServerThread3 implements Runnable {
  
	// 클라이언트와의 통신을 위한 소켓
	private Socket connectionSocket;
	
	private final static String DEFAULT_FILE_NAME = "index.html";
	private final static String NEWLINE = System.getProperty("line.separator");
	
	public ServerThread3(Socket connectionSocket) {
		this.connectionSocket = connectionSocket;
	}
	  
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread start");
		
		// 클라이언트와 통신을 위한 입/출력 스트림을 생성한다.
	    try(BufferedReader in = new BufferedReader(
	    		new InputStreamReader(connectionSocket.getInputStream()));
	    	BufferedOutputStream out = new BufferedOutputStream(connectionSocket.getOutputStream())) {
	    	
	    	// 클라이언트로의 메시지중 첫번째 줄을 읽어들인다.
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
	    		byte[] bytes = new byte[(int)file.length()];
	    		
	    		/********************************************
	    		 * 바이트기반 스트림을 생성하여 파일에서 읽어 byte[]에 담기
	    		 ********************************************/
		    	try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
					bis.read(bytes);
				}

		    	// 정상적으로 처리가 되었음을 나타내는 200 코드를 출력한다.
		    	out.write(("HTTP/1.1 200" + NEWLINE).getBytes());
		    	out.write(("Content-type: " + contentType(fileName) + NEWLINE).getBytes());
		    	out.write(("Content-length: " + bytes.length + NEWLINE).getBytes());
		    	// header부의 끝을 알리기 위해 한줄 띄기
		    	out.write(NEWLINE.getBytes());
		    	out.write(bytes, 0, (int)file.length());
		    	
	    	} else {
	    		// 상태 코드 404 : Not Found
	    		out.write(("HTTP/1.1 404" + NEWLINE).getBytes());
		    	out.write(("Content-type: text/html" + NEWLINE).getBytes());
		    	String response = "<html><head><title>My Web Server</title></head>" +
		    					  "<body><h1>" + fileName + " File Not Found</h1></body></html>";
		    	out.write(("Content-length: " + response.length() + NEWLINE).getBytes());
		    	// header부의 끝을 알리기 위해 한줄 띄기
		    	out.write(NEWLINE.getBytes());
		    	out.write(response.getBytes(), 0, response.getBytes().length);
	    	}
	    	out.flush();
	    	
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	try {
				connectionSocket.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	System.out.println(Thread.currentThread().getName() + " thread close");
	    }
	}
	
	private static String contentType(String fileName) {
	    if(fileName.endsWith(".htm") || fileName.endsWith(".html")) {
	        return "text/html";
	    } else if(fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")) {
	    	return "image/jpeg";
	    } else if(fileName.endsWith(".gif")) {
	    	return "image/gif";
	    } else if(fileName.endsWith(".png")) {
	    	return "image/png";
	    }
	    return "application/octet-stream";
	}
}

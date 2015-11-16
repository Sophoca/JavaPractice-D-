package org.dimigo.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ ServerThread
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author	    : 이름
 * @version		: 1.0
 */
public class ServerThread implements Runnable {
  
	// 클라이언트와의 통신을 위한 소켓
	private Socket connectionSocket;
	 
	public ServerThread(Socket connectionSocket) {		
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

			// 정상적으로 처리가 되었음을 나타내는 200 코드를 출력한다.
			out.println("HTTP/1.1 200");
			out.println("Content-type: text/html");
			String response = "<html><head><title>My Web Server</title></head>" +
					"<body><h1>Welcome to My Web Server!</h1></body></html>";
			out.println("Content-length: " + response.length());
			// header부의 끝을 알리기 위해 한줄 띄기
			out.println("");
			out.println(response);

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

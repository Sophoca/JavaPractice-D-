package org.dimigo.thread;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ WebServer
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class WebServer {
	  
	public static void main(String argv[]) throws Exception {
		
        // 서버소켓을 생성한다. 웹서버는 기본적으로 80번 포트를 사용한다.
        try(ServerSocket listenSocket = new ServerSocket(80)) {
	        System.out.println("Webserver starting up on port 8000");
	        System.out.println("(press ctrl-c to exit)");
	        
	        Socket connectionSocket;
	        Thread serverThread;
	  
	        // 반복문을 돌면서 클라이언트의 접속을 받는다.
	        while((connectionSocket = listenSocket.accept()) != null) {
	            // 스레드를 생성하여 실행한다.
	            serverThread = new Thread(new ServerThread(connectionSocket));
	            serverThread.start();
	        }
	        
        } catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

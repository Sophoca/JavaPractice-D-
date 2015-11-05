/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * <pre>
 * org.dimigo.io
 *   |_ NaverSearch
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: 2636 홍성빈
 * @version		: 1.0
 */
public class NaverSearch {

	public static final String NAVER_OPEN_URL = "http://openapi.naver.com/search";
	public static final String SEARCH_KEY = "f45d2780e74669231a450c8cb3ffc78f";
	
	public static void main(String[] args) {		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
	    try {
	    	String keyword;

			/********************************************************
	         * 표준입력으로 검색할 키워드를 입력받기
	         * > 키워드를 입력하세요 => 스타워즈
	         ********************************************************/
			System.out.printf("키워드를 입력하세요 => ");

			Scanner scanner = new Scanner(System.in);
			keyword = scanner.nextLine();
            scanner.close();

            HttpGet httpget = new HttpGet(NAVER_OPEN_URL + "?key=" + SEARCH_KEY + "&query=" + keyword + "&display=10&start=1&target=movie");
	        System.out.println("Executing request " + httpget.getRequestLine());

	        // Create a custom response handler
	        ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
	        
	        String responseBody = httpclient.execute(httpget, responseHandler);
	        System.out.println("----------------------------------------");
			System.out.println(responseBody);
	        
	        List<Movie> movieList = NaverMovieXMLParser.parse(responseBody);		// 파싱
			System.out.println(movieList);
	        
	        /********************************************************
	         * 검색된 순서대로 출력하기
	         * 1. 스타워즈 에피소드 8 - [오스카 아이삭, 베네치오 델 토로]
	         * 2. 스타 워즈 앤솔로지: 로그 원 - [펠리시티 존스, 벤 멘델슨, .. ]
	         * 3. 스타워즈: 깨어난 포스 - [해리슨 포드, 마크 해밀, 캐리 피셔, .. ]
	         ********************************************************/
	        
	        int counting = 0;
			String str = "";

			for(Movie movie : movieList) {
				counting++;
				str += counting + ". " + movie.getTitle() + " - " + movie.getActors() + "\n";
			}

			System.out.println(str);

			// files/movies.txt 파일에 write하기

			File file = new File("C:\\Users\\성빈\\git\\JavaPractice\\file\\movies.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(str);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
				if(httpclient != null) httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	}

}

/**
 * 
 */
package org.dimigo.oop;

import java.util.*;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Score
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre> 
 * 
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		int tot = kor + math + eng;
		double avg = tot/3;
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\n<< 점수출력 >>\n")
		  .append("국어 점수 : ")
		  .append(kor)
		  .append(" 점\n")
		  .append("수학 점수 : ")
		  .append(math)
		  .append(" 점\n")
		  .append("영어 점수 : ")
		  .append(eng)
		  .append(" 점\n")
		  .append("총점 : ")
		  .append(tot)
		  .append(" 점\n")
		  .append("평균 : ")
		  .append(avg)
		  .append(" 점\n").toString();
		
		System.out.println(sb);
		
		scanner.close();
		  
	}
	
}

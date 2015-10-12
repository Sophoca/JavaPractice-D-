/**
 * 
 */
package org.dimigo.oop;

import java.util.*;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre> 
 * 
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String answerA = "빅뱅";
		String answerB = "조인성";
		String answerC = "자바";		
		
		System.out.println("가장 좋아하는 가수는?");
		String answer1 = scanner.nextLine();
		if(answerA.equals(answer1)) {
			System.out.println("정답입니다!! ^^");
		} else System.out.println("틀렸습니다!! ㅠ");
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if(answerB.equals(answer2)) {
			System.out.println("정답입니다!! ^^");
		} else System.out.println("틀렸습니다!! ㅠ");
		
		System.out.println("가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		if(answerC.equals(answer3)) {
			System.out.println("정답입니다!! ^^");
		} else System.out.println("틀렸습니다!! ㅠ");
		
		scanner.close();
	}

}

/**
 * 
 */
package org.dimigo.oop;

import java.util.*;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가장 좋아하는 축구선수는?");
		String answer1 = scanner.nextLine();
		if(answer1.equals("케빈 미랄라스")) {
			System.out.println("정답입니다!! ^^");
			System.out.println();
		}
		else {
			System.out.println("틀렸습니다!! ㅠ");
			System.out.println();
		}

		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if(answer2.equals("클로이 모레츠")) {
			System.out.println("정답입니다!! ^^");
			System.out.println();
		}
		else {
			System.out.println("틀렸습니다!! ㅠ");
			System.out.println();
		}

		System.out.println("가장 좋아하는 과목는?");
		String answer3 = scanner.nextLine();
		if(answer3.equals("자바")) {
			System.out.println("정답입니다!! ^^");
			System.out.println();
		}
		else {
			System.out.println("틀렸습니다!! ㅠ");
			System.out.println();
		}

		scanner.close();
	}

}

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

public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.printf("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.printf("영어 점수 입력 => ");
		int eng = scanner.nextInt();

		int sum = kor + math + eng;
		double avg = (double)sum/3;

		StringBuilder sb = new StringBuilder();

		sb.append("<< 점수 출력 >>\n")
		.append("국어점수 : " + kor + " 점\n")
		.append("수학점수 : " + math + " 점\n")
		.append("영어점수 : " + eng + " 점\n")
		.append("총점 : " + sum + " 점\n")
		.append("평균 : " + String.format("%.1f", avg) + " 점\n");

		System.out.println();
		System.out.println(sb);

		scanner.close();
	}

}

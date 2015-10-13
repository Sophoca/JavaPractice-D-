package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {

		long average_salary = 1700000;
		int staff = 3;
		int total_store = 1500;
		long year_salary = average_salary * 12 * staff * total_store;

		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", average_salary) + "원");
		System.out.println("점포 내 직원 수 : " + staff + "명");
		System.out.println("점포 수 : " + String.format("%,d", total_store) + "개");

		System.out.println("");
		System.out.println("");

		System.out.println("연간 인건비 : " + String.format("%,d", year_salary) +"원");

	}

}
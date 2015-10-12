 /**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre> 
 * 
 * @author	: 2636 홍성빈
 * @version : 1.0
 */  

public class CarTest {
	public static void main(String[] args) {
		Car3 a = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000); 
		System.out.println("<< 자동차 목록 >>"); 
		System.out.println("제조사명 : "+ a.getCompany()); 
		System.out.println("모델명 : "+ a.getModel()); 
		System.out.println("색상 : "+ a.getColor()); 
		System.out.println("최대속도 : "+ a.getMaxSpeed()); 
		System.out.println("가격 : "+ String.format("%,d", a.getPrice())); 
		System.out.println("");
		
		Car3 b = new Car3("기아자동차", "k7", "흰색", 246); 
		System.out.println("제조사명 : " + b.getCompany()); 
		System.out.println("모델명 : " + b.getModel()); 
		System.out.println("색상 : " + b.getColor()); 
		System.out.println("최대속도 : " + b.getMaxSpeed()); 
		System.out.println("가격 : "+ String.format("%,d", b.getPrice())); 
		System.out.println("");

		Car3 c = new Car3("삼성자동차", "SM7", "회색"); 
		System.out.println("제조사명 : " + c.getCompany()); 
		System.out.println("모델명 : " + c.getModel()); 
		System.out.println("색상 : " + c.getColor()); 
		System.out.println("최대속도 : " + c.getMaxSpeed()); 
		System.out.println("가격 : "+ String.format("%,d", c.getPrice()));
	} 
}

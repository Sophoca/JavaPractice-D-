/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 18.
 * </pre> 
 * 
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class SnackTest {
	public static void main(String[] args) {
		Snack[] snack = new Snack[]{new Snack("새우깡", "농심", 1100, 2),
									new Snack("콘칲", "크라운", 1200, 1),
									new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		int total = 0;
		
		for(Snack value : snack) {
			value.printSnack();
			System.out.println();
			total += value.calcPrice();
		}
		
		System.out.println("총 구매금액 : " + String.format("%,d", total) + "원");
		
		
	}
}

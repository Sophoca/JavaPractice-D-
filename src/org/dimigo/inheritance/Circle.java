/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Figure
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class Circle extends Figure {
	private int radius;

	public Circle(int radius) {
		super(0, 0);
		this.radius = radius;
	}

	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}

	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}

	protected double calcArea() {
		return Math.PI * radius * radius;
	}
}

/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Rectangle
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 8. 20.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class Rectangle extends Figure {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}

	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}

	protected double calcArea() {
		return width * height;
	}
}

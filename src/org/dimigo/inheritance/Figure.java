/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Figure
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 8. 20.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class Figure {
	private int centerX;
	private int centerY;

	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	protected double calcArea() {
		return 0.0;
	}

	protected void printCenter() {
		System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
	}

	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}
}

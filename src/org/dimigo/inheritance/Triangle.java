/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Triangle
 * 
 * 1. 俺夸 : 
 * 2. 累己老 : 2015. 8. 20.
 * </pre> 
 * 
 * @author	: 2636 全己后
 * @version : 1.0
 */

public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return (width * height / 2);
	}
	
	protected void printCenter() {
		System.out.print("伙阿屈狼 ");
		super.printCenter();
	}
}

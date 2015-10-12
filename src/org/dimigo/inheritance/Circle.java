/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Circle
 * 
 * 1. 俺夸 : 
 * 2. 累己老 : 2015. 8. 20.
 * </pre> 
 * 
 * @author	: 2636 全己后
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
	
	protected double calcArea() {
		return (Math.PI * radius * radius);
	}
	
	protected void printCenter() {
		System.out.print("盔狼 ");
		super.printCenter();
	}
}

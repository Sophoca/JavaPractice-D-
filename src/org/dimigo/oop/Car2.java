/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Car
 * 
 * 1. 俺夸 : 
 * 2. 累己老 : 2015. 4. 13.
 * </pre> 
 * 
 * @author	: 2636 全己后
 * @version : 1.0  
 */

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
	}
	
	public Car2() {
		
	}

	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
}

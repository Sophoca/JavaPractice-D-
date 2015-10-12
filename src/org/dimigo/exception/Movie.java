/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	 |_ Movie
 * 
 * 1. 俺夸 : 
 * 2. 累己老 : 2015. 9. 23.
 * </pre> 
 * 
 * @author	: 2636 全己后
 * @version : 1.0
 */

public class Movie {

	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
	
}

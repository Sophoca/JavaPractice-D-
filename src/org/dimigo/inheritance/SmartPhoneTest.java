/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhoneTest
 * 
 * 1. °³¿ä : 
 * 2. ÀÛ¼ºÀÏ : 2015. 8. 28.
 * </pre> 
 * 
 * @author	: 2636 È«¼ººó
 * @version : 1.0
 */

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "¾ÖÇÃ", 700000),
				new Galaxy("°¶·°½Ã S6", "°¶·°½Ã", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			
			// Iphone or Galaxy ±â´É »ç¿ë
			phone.useSpecialFunction(phone);
			
			phone.turnOff();
			System.out.println();
		}		

	}

}

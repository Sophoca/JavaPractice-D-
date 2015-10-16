/**
 *
 */
package org.dimigo.abstractclass;

import org.dimigo.inheritance.Galaxy;
import org.dimigo.inheritance.IPhone;
import org.dimigo.inheritance.SmartPhone;

/**
 * <pre>
 * org.dimigo.abstractclass
 * 	 |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 3.
 * </pre> 
 *
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "갤럭시", 650000)
		};

		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();

			// Iphone or Galaxy 기능 사용
			phone.useSpecialFunction();

			phone.turnOff();
			System.out.println();
		}

	}

}

/**
 *
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 * 	 |_ Galaxy
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 3.
 * </pre> 
 *
 * @author	: 2636 홍성빈 111
 * @version : 1.0
 */

public class Galaxy extends SmartPhone {
	public Galaxy() {

	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}

	public void pay() {
		System.out.println("삼성페이로 결제합니다");
	}

	public void useWirelessCharging() {
		System.out.println("무선 충전기능을 사용합니다");
	}
}

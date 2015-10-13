/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Galaxy
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class Galaxy extends SmartPhone {
	public Galaxy() {

	}

	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}

	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}

	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}

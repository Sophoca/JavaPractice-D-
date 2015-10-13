/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ IPhone
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class IPhone extends SmartPhone {
	public IPhone() {

	}

	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}

	public void pay() {
		System.out.println("애플 페이로 결제합니다.");
	}

	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}

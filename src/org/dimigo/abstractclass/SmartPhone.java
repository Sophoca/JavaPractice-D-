/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 * 	 |_ SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 3.
 * </pre> 
 * 
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(SmartPhone phone) {
		if(this instanceof IPhone) {
			IPhone i = (IPhone)this;
			i.useAirDrop();
		}
		else if(this instanceof Galaxy) {
			Galaxy g = (Galaxy)this;
			g.useWirelessCharging();
		}
	}

	public String toString() {
		return "모델명 : " + model + ", 회사명 : " + company + ", 가격 : " + price + "원";
	}
}

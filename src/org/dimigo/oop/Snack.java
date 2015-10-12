/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Snack
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 18.
 * </pre> 
 * 
 * @author	: 2636 홍성빈
 * @version : 1.0
 */

public class Snack {
		String name;
		String company;
		int price;
		int product;
		
		Snack() {}
		
		Snack(String name, String company, int price, int product) {
			this.name = name;
			this.company = company;
			this.price = price;
			this.product = product;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCompany() {
			return company;
		}
		
		void setCompany(String company) {
			this.company = company;
		}
 
		int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getProduct() {
			return product;
		}

		public void setProduct(int product) {
			this.product = product;
		}
		
		public void printSnack() {
			System.out.println("이름 : " + name);
			System.out.println("제조사 : " + company);
			System.out.println("가격 : " + String.format("%,d", price));
			System.out.println("개수 : " + product + "개");
		}
		
		public int calcPrice() {
			return product * price;
		}
	
}

package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i == j) System.out.print("*");
				else System.out.print(j);
			}
			System.out.println("");
		}
	}
}

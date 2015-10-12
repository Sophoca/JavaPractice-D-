package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int bus_pair = 850, light_car_pair = 300, else_car_pair = 600;
		int distance = 10;
		int money;
		String car = "고속버스";		// "고속버스", "경차", "그 외";
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		
		switch(car) {
		case "고속버스":
			money = bus_pair + (distance - 1) / 10 * 300;
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + money + "원");
			break;
			
		case "경차":
			money = light_car_pair + (distance - 1) / 10 * 200;
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + money + "원");
			break;
			
		case "그 외":
			money = else_car_pair + (distance - 1) / 10 * 200;
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + money + "원");
			break;
			
		default:
			System.out.println("잘못된 차종");
			break;
		}
	}
}

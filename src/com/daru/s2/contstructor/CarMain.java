package com.daru.s2.contstructor;


public class CarMain {

	public static void main(String[] args) {
	
		Car.company = "BMW";

		//변수선언 = new 생성자 호출
		Car car = new Car();
		car.info();
		//car.Car();는 에러
		
		Car car2 = new Car("K5");
		car2.brand ="k5";//변경가능
		car2.info();
		
		Car car3 = new Car("k3", "white");
		car3.info();
	
		Car car4 = new Car("k5", "yellow", 2000);
		car4.info();
	}

}

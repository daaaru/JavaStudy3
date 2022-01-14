package com.daru.s2.contstructor;


public class Car {
	
	String brand;
	public static String company = "Kia";;
	String color;
	int cc;
	
	//생성자
	//특수한 메서드
	//기본생성자(매개변수 없는 생성자
	//모든객체에 동일하게 들어가야할때
	//객체생성할때딱 한번 호출됨
	//참조변수명.생성자 이렇게는 못씀
	//객체를 만들때 딱 한번 호출됨
	public Car() {
		this("k9");
//		this.company="Kia";
//		this.brand="k9";
//		this.color="black";
//		this.cc =5000;
//		//car car2 = new Car(); 에러
		//k9, k7만들어야할때
		
	}
	
	public Car(String brand) {//매개변수로 선언된 지역변수
		this(brand, "black");
//		this.company="Kia";//this를 지우면 안됨 지역변수로 인식함
//		this.brand = brand;
//		this.color="black";
//		this.cc=5000;
	}
	//생성자 선언
	//흰색이나 내가 원하는색으로 
	public Car(String brand, String color) {
		this(brand, color, 5000);
//		this.company="Kia";
//		this.brand=brand;
//		this.color=color;
//		this.cc =5000;
	}
	public Car(String brand, String color, int cc) {
		this.brand=brand;
		this.color=color;
		this.cc =cc;
	}
	
	
	
	//멤버메서드
	public void info() {
		System.out.println("멤버 메서드");
		System.out.println(Car.company);//클래스명.변수명으로 접근함
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
	}
	
}

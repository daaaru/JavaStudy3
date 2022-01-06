package com.daru.s2.contstructor;

public class EngineMain {

	public static void main(String[] args) {

		Engine engine = new Engine();
		System.out.println("객체 생성 후 대입");
		engine.name = "V4";
		engine.fuel = "F4";
		engine.info();//초기화블럭에서 선언된것이 나옴
		
	}

}

package com.daru.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		System.out.println("MainMethod Start");
		System.out.println("Conflict Test");

		//메모리영역이 다르면 중복선언이 아님
		
		
		//객체 생성 코드
		//new 클래스명();
		ReturnStudy rs = new ReturnStudy();
		
		//참조변수명.멤버들
		rs.test1();
		int num = rs.test2();//int타입의 랜덤이 담기므로담아주는걸만들어줌
		System.out.println("Main: "+num);
		
		
		String name = rs.test3(); //무슨값이 올줄 모르기때문에 변수에 넣어줌
		
		
		System.out.println("Name: "+name);
		
		double random = Math.random();
		
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		
		System.out.println("age: "+age);
		System.out.println("Math.random: "+random);
		
		System.out.println("MainMethod Finish");
	}

}

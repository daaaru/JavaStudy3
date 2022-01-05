package com.daru.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}

	
	public Scanner test4() {
		Scanner sc = new Scanner(System.in);
		return sc;
		
	}
	
	
	
	public String test3() { //void와 충돌
		//키보드로부터 이름을 입력고 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		return name;
	}
	
	public int test2() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("Test2: "+num);
		return num; //return타입에는 retun할 데이터타입을 적음
	}

	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}
	public void test1() {
		System.out.println("void는 리턴이 없을때 사용");
	}
}

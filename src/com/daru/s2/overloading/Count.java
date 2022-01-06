package com.daru.s2.overloading;

public class Count {
	
	public void hap(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	public void hap(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void hap(float num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
		//타입의 구성
	}
	public void hap(int num1, int num2, int num3) {
		double sum = num1 + num2;
		System.out.println(sum);
		//매개변수의 갯수
	}
	
	
}

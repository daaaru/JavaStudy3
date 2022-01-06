package com.daru.s1.student;

public class Student {
	//데이터를 담는 용도(가방)
	//데이터를 저장 용도
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	
	int total;
	double avg;
	
	public void makeTotal() {
		System.out.println("참조변수 this");
		System.out.println("참조변수 this: "+this);
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		
		//만들어진 객체의 주소들어감
		
	//	this.total = this.kor + this.eng + this.math;
//		total = kor + eng + math;//this 생략 가능
//		//지역변수와 멤버변수를 구분하기위해 this를 쓴다
//		hello();
		
		//this값과 
		//this는 자기자신 객체의 주소
		//참조변수는 주소를가르킴
		//this는 객체내에서만 쓸수있음
	}
	
	public void hello() {
		System.out.println("hi");
	}
	
}

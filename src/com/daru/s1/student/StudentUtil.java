package com.daru.s1.student;

import java.util.Scanner;

public class StudentUtil {
	Scanner sc;
	
	public StudentUtil() {
		this.sc = new Scanner(System.in);
		
	}
	
	// 학생을 생성하고 정보를 입력받는 곳
	public void initUtil() {
		sc = new Scanner(System.in);
	}
	
	public Student search(Student [] students) {//이거
		// 검색할 학생의 번호를 입력받음
		// 학생의 번호 입력

		System.out.println("번호를 입력해주세요");
		int num = sc.nextInt();
		
		Student student = null;//기본값 넣어주면됨 i인식불가
		
		for(int i=0;i<students.length;i++) {
			if(students[i].num == num) {//이거
				System.out.println("Find");
				student = students[i];//i는 리턴이 안되어서 
				break;
			}
		}
			return student;
		// 입력받은 번호와 일치하는 학생을 찾아서 리턴
		// 모든학생을 검사했는지 물어봄
		// 1. 맞으면 종료
		// 2. 아니면 3번으로 이동
		
		
		
			
		
		

		// 3번 학생한명을 불러서 번호가 같은지 물어봄
		// 1. 번호가 같으면 해당학생 출력
		// 2. 번호가 다르면 2번으로 감

	}

	// 학생의수를입력받음
	// 키보드로부터 이름, 번호, 국어, 영어, 수학을 입력받음 리턴
	// 학생들의 정보를 리턴
	// 배열
	public Student[] makeStudents() {
		// 학생의 수를 입력 받음
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		Student[] students = new Student[count];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			// 키보드로 부터 이름, 번호, 국어 영어 수학 입력
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			student.makeTotal();
			students[i] = student;
		}

		// 학생들의 정보를 리턴
		return students;
	}

	public Student makeStudent() {
		// 키보드로 부터 이름, 번호, 국어 영어 수학 입력 리턴
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("번호 입력");
		int num = sc.nextInt();
		System.out.println("국어 입력");
		int kor = sc.nextInt();
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		System.out.println("수학 입력");
		int math = sc.nextInt();
		// 1. 배열 - 같은 데이터타입(X)
		// 2. class
		Student student = new Student();
		student.name = name;
		student.num = num;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		student.makeTotal();

		return student;
	}
}

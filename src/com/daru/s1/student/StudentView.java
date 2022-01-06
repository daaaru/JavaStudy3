package com.daru.s1.student;

public class StudentView {
	//출력 전용

	public void view(String message) {
		//문자열 출력
		//외부에서문자열을 하나 받음
		//매개변수를 통해서
		System.out.println("-------------------");
		System.out.println(message);
		System.out.println("-------------------");

	}
	
	//메서드명 viewStudent : 학생의 모든 정보를 출력하는 메서드
	public void view(Student student) {
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.num);
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : "+student.total);
		System.out.println("평균 : "+student.avg);
	}
//		Student student = students[i]//여기생각 클래스가져오기
//		this.viewStudent(student);

		
	//viewStudents : 여러명 학생의 모든 정보를 출력하는 메서드
		public void view(Student [] students) {
	for(int i=0;i<students.length;i++) {
		//Student student = students[i];
		//this.viewStudent(student);
		this.view(students[i]);
		}
	}
	
}

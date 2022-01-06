package com.daru.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		boolean check = true;
		// switch case사용
		Scanner sc = new Scanner(System.in);
		StudentUtil studentUtil = new StudentUtil();
		studentUtil.initUtil();
		Student[] students = null;
		StudentView studentView = new StudentView();

		while (check) {
			System.out.println("1. 학생들의 정보입력");
			System.out.println("2. 학생들의 정보출력");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			// 멤버메서드 실행하려면 객체부터만들어야함
			switch (select) {
			case 1:
				students = studentUtil.makeStudents();
				break;
			case 2:
				if (students != null) {
					studentView.viewStudents(students);
				} else {
					studentView.viewMessage("학생정보를 먼저입력하세요");
				}
				break;
			case 3:
				if (students == null) {
					studentView.viewMessage("학생 정보가 없습니다");
					continue;
				}
				Student student = studentUtil.search(students);
				if (student != null) {
					studentView.viewStudent(student);
				} else {
					studentView.viewMessage("검색결과가 없습니다");
				}
				break;
			default:
				check = false;

			}

		}
	}
}
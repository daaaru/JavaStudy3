package com.daru.s1.student;


public class StudentMain {

	public static void main(String[] args) {

//		StudentView sv = new StudentView();//객체생성
//		StudentUtil su = new StudentUtil();
// 
//		Student [] students = new Student[2];
//		Student student = new Student(); //이것도생각하기
//		student.name="daru"; //이거생각하기
//		student.num=1;
//		student.kor=40;
//		student.math=34;
//		student.eng=69;
//		students[0]=student;
//		
//		student = new Student();
//		student.name="dsaru"; //이거생각하기
//		student.num=31;
//		student.kor=60;
//		student.math=74;
//		student.eng=49;
//		students[1]=student;
//
//		Student student2 = su.search(students);
//		if(student2 != null) {
//			sv.viewStudent(student2);
//		//System.out.println(student2.name);
//		}else {
//			sv.viewMessage("학생이없다");
//			//System.out.println("학생이 없다");
//		}
		
		StudentController sc =new StudentController();
		sc.start();
//		
//		Student student = new Student();
//		student.name = "daru";
//		student.kor = 10;
//		student.eng = 10;
//		student.math = 10;
////		student.hello();
//		student.makeTotal();//this를 찍음
//		System.out.println("참조변수 student: "+student);
//		System.out.println("Student Total: "+student.total);
//		
//		
//		Student student2 = new Student();
//		student2.kor = 20;
//		student2.eng = 20;
//		student2.math = 20;
//		System.out.println("참조변수 student2: "+student2);
//		student2.makeTotal();
//		System.out.println("Student2 Total: "+student2.total);

		
		
		System.out.println("종료");
		
		//sv.viewStudents(students);
		
		
		
		
		
		
	}
}
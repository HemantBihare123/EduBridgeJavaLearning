package com.learning.Constructor;

//problem
//class Student{
//	String studentId = "CS01";
//	public void getStudentId() {
//		System.out.println(this.studentId);
//	}
//}

class Student{
	String studentId;
	Student(String id){
		studentId = id;
	}
	public void getStudentId() {
	System.out.println(this.studentId);
}
}



public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Student s1 = new Student();
//			Student s2 = new Student();
//			Student s3 = new Student();
//			s1.getStudentId();
//			s2.getStudentId();
//			s3.getStudentId();

			Student s1 = new Student("CS1001");
			Student s2 = new Student("CS1002");
			Student s3 = new Student("CS1003");
			s1.getStudentId();
			s2.getStudentId();
			s3.getStudentId();
	}

}

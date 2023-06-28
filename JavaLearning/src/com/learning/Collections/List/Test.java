package com.learning.Collections.List;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int studentId;
	private String studentFname;
	private String studentLname;
	
	public Student(int studentId, String studentFname, String studentLname) {
		super();
		this.studentId = studentId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFname() {
		return studentFname;
	}

	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}

	public String getStudentLname() {
		return studentLname;
	}

	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFname=" + studentFname + ", studentLname=" + studentLname
				+ "]";
	}
	
	
	

	
	
}


public class Test {
	
	public static String[] getFname(List<Student> list) {
		String[] name = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			name[i] = list.get(i).getStudentFname();
		}
		return name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Hemant", "S");
		Student s2 = new Student(1, "R", "S");
		Student s3 = new Student(1, "D", "S");
		Student s4 = new Student(1, "At", "S");
		Student s5 = new Student(1, "NT", "S");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		String[] name = getFname(studentList);
		for(String fname: name) {
			System.out.println(fname);
		}
		
		

	}

	

}

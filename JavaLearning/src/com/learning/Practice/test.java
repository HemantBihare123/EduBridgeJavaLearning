package com.learning.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of student details you want to enter: ");
		int number = sc.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter of student "+(i+1) +" Id: ");
			int id = sc.nextInt();
			System.out.println("Enter of student "+(i+1) +" fname: ");
			String Fname = sc.next();
			System.out.println("Enter of student "+(i+1) +" lname: ");
			String Lname = sc.next();
			Student sd = new Student(id, Fname, Lname);
			list.add(sd);
			
		}

		for (Student str : list) {
			System.out.println(str);
			
		}
		
		
		


	}

}

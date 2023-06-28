package com.learning.Constructor;

import java.util.Scanner;

public class Employee {
	static int count=0;
	int EmployeeId;
	String Firstname;
	String Lastname;

	Employee(int id, String firstname, String lastname) {
		count++;
		EmployeeId = id;
		Firstname = firstname;
		Lastname = lastname;
	}

	public void getEmployeeDetails() {
		System.out.println
		("Employee Details: " + '\n' + EmployeeId 
				+ "\n" + Firstname + "\n" +Lastname);
	}
	public String getEmployeeDetail() {
		return
		("Employee Details: " + '\n' +"Employee Id: "+ EmployeeId 
				+ "\n"+"Firstname: " + Firstname + "\n"+"Lastname: " +Lastname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of Employee details you want to enter: ");
		 Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			Employee[] emp = new Employee[number];
			for (int i = 0; i <number; i++) {
				System.out.println("Enter Employee number " + (i+1) + " Id: ");
				int EmployeeId = sc.nextInt();
				System.out.println("Enter Employee " + (i+1) + " Firstname: ");
				String Firstname = sc.next();
				System.out.println("Enter Employee " + (i+1) + " Lastname: ");
				String Lastname = sc.next();
				 emp[i] = new Employee(EmployeeId, Firstname, Lastname);
				 System.out.println("---------------------------------");
			}
			
			for(Employee count: emp) {
				count.getEmployeeDetails();
				System.out.println("----------------------------------");
				System.out.println("Employee id: "+ count.EmployeeId);
				System.out.println("Employee Name: "+count.Firstname);
				System.out.println("Employee LastName:"+count.Lastname);
				System.out.println("-----------------------------------");
			}
			System.out.println("-----------------------------------");
			for(Employee counts: emp) {
				counts.getEmployeeDetail();
			}
			
			
			
			
			System.out.println(Employee.count);
		}
		
	}



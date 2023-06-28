package com.learning.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
	private int id;
	private String fname;
	private String lname;
	
	Employee(int id, String fname, String lname){
		this.id =id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	

	public int getId() {
		return id;
	}

	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
     
    	  
      
}

class Main{
	
	public static void main(String[] args) {
		
		
	List<Employee> emp = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of emp you want to add: ");
	int num = sc.nextInt();
	for(int i=0; i<num; i++) {
		System.out.println("Enter "+(i+1)+" Employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter "+(i+1)+" Employee First name: ");
		String fname = sc.next();
		System.out.println("Enter "+(i+1)+" Employee Last name: ");
		String lname = sc.next();
		//emp.add(new Employee(id, fname, lname));
		Employee emps = new Employee(id, fname, lname);
		emp.add(emps);
	}
	System.out.println("----------------------------------");
	System.out.println("Output");
	System.out.println(emp);
	System.out.println("-------------111--------------");
	Iterator itr = emp.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	System.out.println("------------222-----------------");
	for(Employee i : emp) {
		System.out.println("Firstname= "+i.getFname());
	}
	System.out.println("------------333-----------------");
	for(Employee i : emp) {
		System.out.println("ID= "+i.getId());
	}
	System.out.println("------------444-----------------");
	for(Employee i : emp) {
		System.out.println("Firstname= "+i.getLname());
	}
	
	
	
	}	
}

package com.learning.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empFname;
	private String empLname;
	private double empSalary;

	public Employee(int empId, String empFname, String empLname, double empSalary) {
		super();
		this.empId = empId;
		this.empFname = empFname;
		this.empLname = empLname;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFname() {
		return empFname;
	}

	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}

	public String getEmpLname() {
		return empLname;
	}

	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFname=" + empFname + ", empLname=" + empLname + ", empSalary="
				+ empSalary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		
		
		return this.getEmpId() - emp.empId;
		//return emp.getEmpId()- this.empId;
		//return this.getEmpFname().compareTo(emp.getEmpFname());
		
	}
	

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(4, "Hemant", "Bihare", 20000);
		Employee emp2 = new Employee(5, "Rahul", "Singh", 30000);
		Employee emp3 = new Employee(3, "Ram", "Roy", 40000);
		Employee emp4 = new Employee(1, "Vivek", "Lal", 50000);
		Employee emp5 = new Employee(2, "Rohan", "Singh", 60000);
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(new Employee(6,"Raj","Singh", 20000));

		System.out.println(list);
		System.out.println("-----------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------");
		for(Employee obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------------");
		System.out.println("after sorting");
		
		Collections.sort(list);
		for(Employee i :list) {
			System.out.println(i);
		}
		
		
		
	}
}

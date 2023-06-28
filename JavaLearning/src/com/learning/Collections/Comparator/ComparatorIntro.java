package com.learning.Collections.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
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

	

}

class SortEmployeeByFirstName implements Comparator<Employee>{

	@Override
	public int compare(Employee eA, Employee eB) {
		// TODO Auto-generated method stub
		return eA.getEmpFname().compareTo(eB.getEmpFname());
	}
	
}
class SortEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}
	
}

class SortEmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getEmpSalary()-o2.getEmpSalary());
	}
	
}
		



public class ComparatorIntro {

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

		// Sort employee based on id
		
		Collections.sort(list, new SortEmployeeById());
		
		
		System.out.println(list);
		System.out.println("--------------------------------");
		// Sort employee based on fname
		Collections.sort(list, new SortEmployeeByFirstName());
		System.out.println(list);
		System.out.println("--------------------------------");
		
		// Sort employee based on salary
		Collections.sort(list, new SortEmployeeBySalary());
		
		System.out.println(list);

	}

}

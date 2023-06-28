package com.learning.StreamAPI;

public class Employee {
	private int id;
	private String emp_name;
	private String emp_lname;
	private double salary;
	private int exp_year;

	public Employee(int id, String emp_name, String emp_lname, double salary, int exp_year) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_lname = emp_lname;
		this.salary = salary;
		this.exp_year = exp_year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_lname() {
		return emp_lname;
	}

	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExp_year() {
		return exp_year;
	}

	public void setExp_year(int exp_year) {
		this.exp_year = exp_year;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_lname=" + emp_lname + ", salary=" + salary
				+ ", exp_year=" + exp_year + "]";
	}

}

package com.learning.Practice;

public class Student {

	private int id;
	private String Fname;
	private String Lname;
	
	
	Student(int id, String Fname, String Lname ){
		this.id = id;
		this.Fname = Fname;
		this.Lname = Lname;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return Fname;
	}
	
	public void setFname(String Fname) {
		this.Fname = Fname;
	}
	
	public String Lname() {
		return Fname;
	}
	
	public void Lname(String Lname) {
		this.Lname = Lname;
	}
	
	
//    @Override
//	public String toString() {
//		return "Student [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + "]";
//	}

	
    @Override
    public String toString() {
    	return "Student [id="+ id + ", Fname="+ Fname+ " , Lname=" + Lname + "]";
    }

  


	

	

}

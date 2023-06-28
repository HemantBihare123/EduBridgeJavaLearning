package com.learning.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Doctor implements Comparable<Doctor>{
    private int id;
    private String Fname;
    private String Lname;
    
    Doctor(int id, String Fname, String Lname){
    	this.id = id;
    	this.Fname = Fname;
    	this.Lname = Lname;
    }
    
    public int getId() {
    	return this.id;
    }
    
    
    public String getFname() {
    	return this.Fname;
    }
    
    public String getLname() {
    	return this.Lname;
    }
    
    

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + "]";
	}

	@Override
	public int compareTo(Doctor dr) {
		// TODO Auto-generated method stub
		//return dr.getFname().compareTo(Fname);
		//return this.getFname().compareTo(Fname);
		return this.Lname.compareTo(Lname);
		
	}

	
	
    
}

class DoctorMain{
	public static void main(String[] args) {
	   List<Doctor> dr = new ArrayList<Doctor>();
	   dr.add(new Doctor(1, "Hemant", "Bihare"));
	   dr.add(new Doctor(2, "Rohan", "Kadam"));
	   dr.add(new Doctor(3, "Vaishnavi", "Gajul"));
	   dr.add(new Doctor(5, "Nikita", "Roy"));
	   dr.add(new Doctor(4, "Maharshi", "Shukla"));
	   
	   
	   Collections.sort(dr);
	   for(Doctor tr : dr) {
		   System.out.println(tr);
	   }
	   
	   
	}
	
	
}

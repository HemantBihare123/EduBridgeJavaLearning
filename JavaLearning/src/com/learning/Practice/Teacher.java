package com.learning.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teacher {
	
	private int id;
	private String fname;
	private String lname;
	public Teacher(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
}

class IdComparator implements Comparator<Teacher>{


	@Override
	public int compare(Teacher o1, Teacher o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}

class FnameComparator implements Comparator<Teacher>{

	@Override
	public int compare(Teacher o1, Teacher o2) {
		// TODO Auto-generated method stub
		return o1.getFname().compareTo(o2.getFname());
	}
	
}

class FnameComparatorDesc implements Comparator<Teacher>{
	
	@Override
	public int compare(Teacher t1, Teacher t2) {
		return t2.getFname().compareTo(t1.getFname());
	}
}


class LastnameComparatorAsc implements Comparator<Teacher>{
	
	@Override
	public int compare(Teacher o1, Teacher o2) {
		return o1.getLname().compareTo(o2.getLname());
	}
}

class TeacherTest{
	public static void main(String[] args) {
		List<Teacher> th = new ArrayList<Teacher>();
		th.add(new Teacher(1,"Hemant", "Bihare"));
		th.add(new Teacher(3,"Shaam", "Tiwari"));
		th.add(new Teacher(4,"Ram", "Mohan"));
		th.add(new Teacher(2,"Govind", "Vitkar"));
		th.add(new Teacher(5,"Krishna", "Gokul"));
		System.out.println("Sorting using Id in ascending order: ");
		System.out.println("-------------------------------------------");
		Collections.sort(th, new IdComparator());
		for(Teacher sorting: th) {
			System.out.println(sorting);
		}
		System.out.println();
		System.out.println("Sorting using first name in ascending order: ");
		System.out.println("-------------------------------------------");
		Collections.sort(th, new FnameComparator());
		for(Teacher sorting : th) {
			System.out.println(sorting);
		}
		System.out.println();
		System.out.println("Sorting using first name in descending order: ");
		System.out.println("-------------------------------------------");
		Collections.sort(th, new FnameComparatorDesc());
		for(Teacher sorting : th) {
			System.out.println(sorting);
		}
		System.out.println();
		System.out.println("Sorting using last name in ascending order: ");
		System.out.println("-------------------------------------------");
		Collections.sort(th, new LastnameComparatorAsc());
		for(Teacher sorting : th) {
			System.out.println(sorting);
		}
	}
}
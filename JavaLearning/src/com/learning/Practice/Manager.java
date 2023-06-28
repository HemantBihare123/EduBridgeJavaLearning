package com.learning.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Manager implements Comparable<Manager> {

	private int id;
	private String fname;
	private String lname;

	Manager(int id, String fname, String lname) {
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
		return "Manager [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

	@Override
	public int compareTo(Manager o) {
//		return o.id - this.id;
//		return o.fname.compareTo(this.fname);
//		return this.fname.compareTo(o.fname);
//		return o.lname.compareTo(this.lname);
		return this.lname.compareTo(o.lname);
	}

}

class sortedId implements Comparator<Manager>{
	
	@Override
	public int compare(Manager o1, Manager o2) {
		return o2.getId()-o1.getId();
	}

}
class Mian {
	public static void main(String[] args) {
		List<Manager> list = new ArrayList<Manager>();
		list.add(new Manager(1, "Hemant", "Bihare"));
		list.add(new Manager(2, "Vaishnavi", "Gajul"));
		list.add(new Manager(3, "Aman", "Singh"));
		list.add(new Manager(4, "Raj", "Singh"));
//		System.out.println(list);
//		System.out.println("----------------------------------");
//		for (Manager i : list) {
//			System.out.println("First Name: " + i.getFname());
//		}
//		System.out.println("----------------------");
//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		System.out.println("----------------------");
//		for (Manager i : list) {
//			System.out.println("Last Name: " + i.getLname());
//		}
//		System.out.println("-------------------------");
//		for (Manager i : list) {
//			System.out.println("Id: " + i.getId());
//		}
//		System.out.println("---------------------------------------");
//		Collections.sort(list);
//		for (Manager i : list) {
//			System.out.println(i);
//		}
//		System.out.println("---------------------------------------");
//		Collections.sort(list, new sortedId());
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		System.out.println("---------------------------------------");
//		list.stream().sorted((o1,o2)->o1.getLname().compareTo(o2.getLname())).forEach(System.out::println);
//		System.out.println("---------------------------------------");
//		list.stream().sorted((o1,o2)->o2.getId()-o1.getId()).forEach(System.out::println);
		
//		Set<Manager> set =
//		list.stream().sorted((o1,o2)->o1.getFname().compareTo(o2.getFname())).collect(Collectors.toSet());
//		
//		set.forEach(System.out::println);
	}

}

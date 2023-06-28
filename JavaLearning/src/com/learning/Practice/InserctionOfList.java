package com.learning.Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class InserctionOfList {
	
	public static void intersection(List<String> list1, List<String> list2) {
		Set<String> set = new LinkedHashSet<String>(list1);
		for(String i : list2) {
			if(!set.contains(i)) {
				set.add(i);
			}
		}
		System.out.println(set);
		
		
	}

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Ram", "Shaam", "Rohan", "John", "Mohan", "Rahul");
		List<String> list2 = Arrays.asList( "Shaam", "Rohan", "Bob", "Sonu", "Rahul");
		intersection(list1,list2);

	}

}

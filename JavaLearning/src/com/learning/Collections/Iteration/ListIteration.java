package com.learning.Collections.Iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteration {

	public static void main(String[] args) {
		String[] arr = {"Hello", "Ram", "Rohan"};
		List<String> list = Arrays.asList(arr);
		
		// Iteration using Iterator
		System.out.println("Iteration using Iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------");
		
		// Iteration using for loop
		System.out.println("Iteration using for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------");
	 
		// Iteration using forEach loop
		System.out.println("Iteration using forEach loop");
	  for(String str: list) {
		  System.out.println(str);
	  }
	  System.out.println("--------------------------");
	  // Iteration using ListIterator
	  System.out.println("Iteration using ListIterator");
		ListIterator<String> l = list.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		
		
		
		
		
		System.out.println("-----------------Integer------------------------");
		int[] array = {1,2,3,4,1,3,3,45,2,4,2,1};
		List<Integer> numberIteration = new LinkedList<Integer>();
		for(int i:array) {
			numberIteration.add(i);
		}
		
		for(Integer number:numberIteration) {
			System.out.print(number+" ");
		}
		System.out.println();
		System.out.println("------------------vector--------------------------");
		String[] vectordata = {"heelo","rohan","Rahul","Shaam"};
		Vector<String> data =  new Vector<String>(Arrays.asList(vectordata));
		
		
		for(String travese: data) {
			System.out.println(travese);
		}
		
	}

}

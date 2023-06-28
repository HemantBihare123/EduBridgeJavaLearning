package com.learning.Collections.Iteration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration {

	public static void main(String[] args) {
		String[] str = {"Hello", "Dog", "Cat", "Tiger", "Hello"};
		Set<String> hashset = new HashSet<String>(Arrays.asList(str));
		
		// Iteration using iterator
		System.out.println("Iteration using iterator");
		Iterator<String> itr = hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------");
		// Iteration using forEach Loop
		System.out.println("Iteration using forEach Loop");
		for(String i:hashset) {
			System.out.println(i);
		}
		
		
		int[] arr = {1,2,3,4,5,6,7,8,1,1,1,1};
		Set<Integer> integer = new HashSet<Integer>();
		// adding int array into set
		for(int i=0; i<arr.length; i++) {
			integer.add(arr[i]);
		}
		
		System.out.println("---------------------------------");
		System.out.println("Iterating set elements using for loop");
		for(Integer i: integer) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Iterating set elements iterator");
		
		int[] arr2 = {2,3,46,6,3,2,9,10,11,15,1,2,4,8,7,9,7};
		Set<Integer> set = new HashSet<Integer>();
		//adding int array element using forEach loop
		for(int element: arr2) {
			set.add(element);
		}
		
		Iterator<Integer> itring =  set.iterator();
		while(itring.hasNext()) {
			System.out.print(itring.next()+" ");
		}
		

	}

}

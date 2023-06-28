package com.learning.Collections.Iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIteration {

	public static void main(String[] args) {
		String[] str = {"B","C","A","F","G","H"};
		
		Set<String> treeset = new TreeSet<String>(Arrays.asList(str));
		Iterator<String> itr = treeset.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------");		
		System.out.println("Using for loop");
		for(String i: treeset) {
			System.out.println(i);
		}
		
		
		System.out.println("----------------Integer----------------------");		
		int[] arr = {4,1,7,2,7,3,6,3};
		Set<Integer> treesetimp = new TreeSet<Integer>();
		for(int i: arr) {
			treesetimp.add(i);
		}
		
		for(Integer i: treesetimp) {
			System.out.println(i);
		}

	}

}

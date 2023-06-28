package com.learning.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;


//insertion order is maintained
public class LinkedHashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new LinkedHashSet<>();
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("C");
		hashSet.add("B");
		hashSet.add("C");
		System.out.println(hashSet);
		hashSet.add(null);
		System.out.println(hashSet);

	}

}

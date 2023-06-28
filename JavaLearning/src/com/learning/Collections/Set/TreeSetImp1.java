package com.learning.Collections.Set;

import java.util.TreeSet;

public class TreeSetImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("E");
		treeset.add("A");
		treeset.add("F");
		treeset.add("D");
		treeset.add("B");
		treeset.add("C");
		System.out.println(treeset);
		treeset.add(null);
		System.out.println(treeset);

	}

}

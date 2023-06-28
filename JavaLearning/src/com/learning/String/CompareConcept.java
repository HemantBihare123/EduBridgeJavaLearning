package com.learning.String;

public class CompareConcept {

	public static void main(String[] args) {
		String s1 = "Deepak";
		String s2 = "deepak";
		System.out.println(s1+" "+s2);
		System.out.println("---------------------------------");
		System.out.println(s1.equals(s2));
		System.out.println("---------------------------------");
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("---------------------------------");
		System.out.println(s1.compareTo(s2));
		System.out.println("---------------------------------");
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		

	}

}

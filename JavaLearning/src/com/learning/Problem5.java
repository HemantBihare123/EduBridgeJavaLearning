package com.learning;

public class Problem5 {
	
	public static void count(String str) {
		int count=0;
		int count1=0;
		String[] split = str.split(" ");
		for(int i=0; i<split.length; i++) {
			count++;
		}
		System.out.println(count);
		
		for(String i : split) {
			count1++;
		}
		System.out.println(count1);
	}
	
	
	
	
	public static void main(String[] args) {
		count("Java is good language helo hi");
	}

}

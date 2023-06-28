package com.learning.Practice;

public class Dami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hemant";
		String str2 ="Hemant";
		System.out.println(str1==str2);
		System.out.println(str1.equalsIgnoreCase(str2));
		StringBuffer sb1 = new StringBuffer(str1);
		StringBuffer sb2 = new StringBuffer(str2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		

	}

}

package com.learning.String;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Encyclopedia";
		String str2 ="Wikipedia";
		// toLowercase
		System.out.println(str.toLowerCase());
		
		//toUppaercase
		System.out.println(str.toUpperCase());
		
		//charAt(index)
		System.out.println(str.charAt(0));
		
		//indexof
		System.out.println(str.indexOf('n'));
		
		//equals
		System.out.println(str.equals("encyclopedia"));

		//equalsIgnorecase
		System.out.println(str.equalsIgnoreCase("encyclopedia"));
		
		//== address
		System.out.println(str==str2);
		
		//length()
		System.out.println(str.length());
		
		//toCharArray
		char[] arr =str.toCharArray();
		for(char ch:arr) {
			System.out.println(ch);
		}
		
		//compareTo
		String s1 ="Apple";
		String s2 ="apple";
		System.out.println(s1.compareTo(s2));
		
		//split
		String s4 = "Hello Java Programming";
		String[] arr1 =s4.split(" ");
		for(String data:arr1) {
			System.out.println(data);
		}
		
		//join
		String result = String.join("*", arr1);
		System.out.println(result);
	}

}

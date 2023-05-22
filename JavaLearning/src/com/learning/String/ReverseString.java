package com.learning.String;

import java.util.Scanner;

public class ReverseString {

//	 1. Frist way
	public static void using_Inbuilt_function(String str) {
//		System.out.println("Given string is: "+ '\n'+str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse of string using inbuilt function: " + '\n' + sb.reverse());
	}
//	2. Second Way
	public static void without_using_Inbuilt_function(String str) {
		System.out.println("Given string is: " + '\n' + str);
		char[] ch = str.toCharArray();
		String rev = "";
		for (int i = 0; i < ch.length; i++) {
			rev = ch[i] + rev;
		}
		System.out.println("Reverse of string without using inbuilt function: " + '\n' + rev);
	}

//	3. Third Way
	public static void using_charAt(String str) {
		System.out.println("Given string is: " + '\n' + str);
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println("Reverse of string using charAt: " + '\n' + rev);
	}
	
//	4. Fourth Way
	public static String dec_loop(String str) {
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		sc.close();
		using_Inbuilt_function(str);
		System.out.println("-------------------------------------------");
		without_using_Inbuilt_function(str);
		System.out.println("-------------------------------------------");
		using_charAt(str);
		System.out.println("-------------------------------------------");
		System.out.println(dec_loop(str));

	}

}

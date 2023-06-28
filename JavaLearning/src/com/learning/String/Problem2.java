package com.learning.String;

public class Problem2 {
	
	public static String reverse(String str) {
		char[] ch = str.toCharArray();
		String str2="";
		for(int i=0; i<ch.length; i++) {
			str2 = ch[i]+ str2;
		}return str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Java is a programming language";
		System.out.println(reverse(str));

	}

}

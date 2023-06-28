package com.learning.String;



public class CheckString {
	
	

	public static void main(String[] args) {
		String a = "abcde";
		String b = "abcd";

		int result = 1;
		for (int i = 0; i < b.length(); i++) {
		    char ch = b.charAt(i);
		    if (a.indexOf(ch) == -1) {
		        result = 0;
		        break;
		    }
		}

		System.out.println(result); // prints 1 if all characters of b are present in a, otherwise 0

		
		

	}

}

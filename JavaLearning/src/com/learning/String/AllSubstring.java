package com.learning.String;

public class AllSubstring {
	
	public static String allSubstringFinder(String str) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				result += str.substring(i,j)+"\n";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(allSubstringFinder(str));

	}

}

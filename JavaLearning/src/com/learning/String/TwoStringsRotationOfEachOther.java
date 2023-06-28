package com.learning.String;

public class TwoStringsRotationOfEachOther {

	public static boolean find(String str1, String str2) {
		String temp = str1.concat(str1);
		if (str1.length() != str2.length() || !temp.contains(str2)) {
			return false;
		}

		return true;

	}
	
	public static void allSubstrings(String str1) {
		for(int i=0; i<str1.length(); i++) {
			for(int j=i+1; j<=str1.length(); j++) {
				System.out.println(str1.substring(i,j));
			}
		}
	}
	public static void rotation(String str1) {
		for(int i=0; i<str1.length(); i++) {
			for(int j=i+1; j<=str1.length(); j++) {
				
			}
		}
	}

	public static void main(String[] args) {
		// abcd bcda cdab dabc
		// abcdabcd
		String str1 = "abcd";
		String str2 = "bcda";
		System.out.println(find(str1, str2));
		allSubstrings(str1);

	}

}

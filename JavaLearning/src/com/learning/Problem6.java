package com.learning;

import java.util.HashSet;
import java.util.Set;

public class Problem6 {
	
	public static void removeChar(String str1, String str2) {
		String str3 = "";
		
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<str2.length(); i++) {
			set.add(str2.charAt(i));
		}
		
		for(int i=0; i<str1.length(); i++) {
			if(!set.contains(str1.charAt(i))) {
				str3 = str3+str1.charAt(i);
			}
		}
		System.out.println(str3);
	}

	public static void main(String[] args) {
		removeChar("wikipedia", "encyclopedia");

	}

}

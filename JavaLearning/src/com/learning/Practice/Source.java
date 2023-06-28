package com.learning.Practice;

import java.util.HashSet;
import java.util.Set;

public class Source {
	public static void main(String[] args) {
		String a = "abedfgiac";
		String b = "abcidae";
		String result ="";
		Set<Character> set = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		for(char c: a.toCharArray()) {
			set.add(c);
		}
		for(char d: b.toCharArray()) {
			if(set.contains(d)) {
				result += d+" ";
			}
		}
		System.out.println("Duplicate "+result);

	}
}

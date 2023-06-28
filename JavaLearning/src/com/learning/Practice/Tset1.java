package com.learning.Practice;

public class Tset1 {

	public static void main(String[] args) {
		String str = "Th@ an%^os  ";
		String regx = "[^a-zA-Z0-9\\s]";
		System.out.println(str.replaceAll(regx, ""));
		
		

	}

}

package com.learning.String;



public class ReplaceConcept {

	public static void main(String[] args) {
		String str = "Hello Hemanto thiso";
		
		System.out.println(str);
		System.out.println(str.replace("o", "i"));
		System.out.println(str.replaceFirst("H", "h"));
		
		System.out.println(str.replaceAll("\\s", ""));

	}

}

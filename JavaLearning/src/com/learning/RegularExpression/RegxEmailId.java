package com.learning.RegularExpression;


/*
 * 
 */
public class RegxEmailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regx = "^[a-zA-Z0-9][a-zA-Z0-9._]*@gmail([.][a-z]+)+$";
		String email = "hemantbihare@gmail.co.in";
		
		System.out.println(email.matches(regx));

	}

}

package com.learning.RegularExpression;



/*
 *  10 digit mobile number
 *  
 *  Rules:-
 *   1.	Each number should contain exactly 10 digits
 *   2. The first digit should be 7 or 8 or 9
 */
public class RegxImplementation {

	public static void main(String[] args) {
		String regx = "(0|\\+91)?[7-9][0-9]{9}$";
		String number = "7000933402";
		System.out.println(number.matches(regx));

	}

}

package com.learning;

public class ThisConcept {

	public static void getPassword(String firstName, String lastname, String number) {

		char ch1 = firstName.charAt(0);
		char ch2 = firstName.charAt(1);
		char ch3 = firstName.charAt(2);
		char ch4 = lastname.charAt(0);
		char ch5 = lastname.charAt(1);
		char ch6 = number.charAt(0);
		char ch7 = number.charAt(1);
		char ch8 = number.charAt(2);

		String Password = "" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7 + ch8;
		System.out.println(Password);

	}

	public static void main(String[] args) {
		ThisConcept.getPassword("Adarsh", "Kumar", "7000933402");

	}

}

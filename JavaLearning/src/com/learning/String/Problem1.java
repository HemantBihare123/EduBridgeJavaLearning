package com.learning.String;



class Password {

	public static String getPassword(String name, String num) {
		char ch1 = name.charAt(1);
		char ch2 = name.charAt(3);
		char ch3 = num.charAt(5);
		char ch4 = num.charAt(8);
		
		String pass =(int)(Math.random())+"" +ch1 +ch2 +ch3+ ch4;
		return pass;
		
		

	}

}

public class Problem1 {

	public static void main(String[] args) {
		
		System.out.println(Password.getPassword("Hemant", "700093342"));

	}

}

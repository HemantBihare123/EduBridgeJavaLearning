package com.learning.DecisionControl;

import java.util.Scanner;

public class AnotherLoginWay {

	public static boolean Username(String username) {
		return username.equals("Hemant") ? true : false;
	}

	public static String login(boolean Username) {

		if (Username != true) {
			return "Invalid username";
		} else {
			System.out.println("Enter the passowrd: ");
			Scanner sc = new Scanner(System.in);
			String password = sc.next();
			sc.close();
			return (password.equals("Password")) ? "Login successful" : "Invalid Password";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the username: ");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		boolean result_username = AnotherLoginWay.Username(username);
		System.out.println(login(result_username));
	}

}

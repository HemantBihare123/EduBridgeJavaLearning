package com.learning.DecisionControl;

import java.util.Scanner;

public class LoginUsingTwoFunctions {

	public static boolean verify_user(String user) {
		return (user.equals("Admin")) ? true : false;
	}

	public static boolean verify_pass(String password) {
		return (password.equals("Admin")) ? true : false;
	}

	public static String login(boolean user_result, Scanner sc) {
		
		if (user_result == false) {
			return "Invalid username";
		} else {
			System.out.println("Enter the password");
//			Scanner sc = new Scanner(System.in);
			String pass = sc.next();
			sc.close();
			boolean pass_result = verify_pass(pass);
			return (pass_result == true) ? "Login Successful" : "Invalid password";
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the username: ");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		boolean user_result = verify_user(user);		
		System.out.println(login(user_result, sc));
	}

}

package com.learning.DecisionControl;

import java.util.Scanner;

class UsernameReg{
	
	public static boolean userName(String username) {
		return username.matches("[a-zA-Z]+")?true:false; 
	}
	public static String usernameCheck(boolean user) {
		return user==false?"Invalid Username":"Login";
	}
}

public class UsernameValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		
		do {
			System.out.println("Enter username: ");
			username = sc.nextLine();
		}while(!UsernameReg.userName(username));
		boolean user = UsernameReg.userName(username);
		System.out.println(UsernameReg.usernameCheck(user));
	}

	

}

package com.learning.DecisionControl;

import java.util.Scanner;

public class login {
	
	//fn boolean username()
	
	//fn boolean password();
	
	//login(user,pass)
	
	public static boolean username(String username) {
		
		return  username.equals("Hemant")?true:false;
		
	}
	public static boolean password(String str1) {
		
		return str1.equals("password")?true:false; 
	}
	 public static String login(boolean user, boolean pass) {
		 if(user==false) {
			 return "Invalid Username";
			
			 
		 }
		 if(pass==false) {
			 return "Invalid Password";
		 }
		 if(user==true && pass==true) {
			 return "Login successful";
		 }else{
		return "Login Fail";
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the username: ");
		Scanner sc = new Scanner(System.in);
		String username= sc.nextLine();
		
		System.out.println("Enter the password: ");
		String password = sc.next();
		
		boolean user = login.username(username);
		boolean pass = login.password(password);
		
		System.out.println(login(user, pass));

	}

}

package com.learning.Practice;

import java.util.Scanner;

public class EmailVerification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		do {
			System.out.println("Enter email address: ");
			email = sc.nextLine();
		}while(!Person.isVaildEmail(email));
		sc.close();
	}

}

class Person{
	
	public static boolean isVaildEmail(String email) {
		if(email.matches("^[a-z][a-z0-9._%+-]*[a-z0-9]@[a-z]+\\.[a-z]{2,}$")) {
			System.out.println("Email Address is Vaild");
			return true;
		}else {
			System.out.println("Invaild Email Address");
			return false;
		}
	}
	

	
}

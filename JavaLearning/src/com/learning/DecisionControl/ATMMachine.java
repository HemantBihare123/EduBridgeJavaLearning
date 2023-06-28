package com.learning.DecisionControl;

import java.util.Scanner;

public class ATMMachine {
	
	public static void bal() {
		System.out.println("bal is called");
	}
	public static void withdraw() {
		System.out.println("withdraw is called");
	}
	public static void deposit() {
		System.out.println("deposit is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="";
		boolean result = str1.equals("yes")?true:false;
		Scanner sc = new Scanner(System.in);
				
		do {
			System.out.println("Please enter the option: ");
			System.out.println("1.bal 2.withdraw 3.deposit");
			
			int choice = sc.nextInt();		
			switch(choice){
			case 1: bal();
					break;
			case 2: withdraw();
			       break;
			case 3: deposit();
					break;
			default: System.out.println("Invalid Input");
			
			System.out.println("Do you want to continue: ");
			
			String str = sc.next();
			  str1=str;
			  System.out.println(str1);
			 
			}
		}while(result==true);
		System.out.println("Thank You");
       sc.close();
	}

}

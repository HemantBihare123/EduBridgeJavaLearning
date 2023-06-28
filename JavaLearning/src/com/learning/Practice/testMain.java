package com.learning.Practice;

import java.util.Scanner;

//One string name and contact number. 
//generate password
//2 and 4 from name and 6 and 9
//from contact number. Contact number 
//should be of 10 digit	

class Check {
	private String name;
	private int num;
	
	public Check() {}

	public Check(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {

		this.num = num;
	}
	

	
	public String generatePassword(String name, double num) {
		String num1 = String.valueOf(num);
		String pass="";
	    String pass2 ="";
		for(int i=0; i<name.length(); i++) {
			pass = pass +name.charAt(1)+ name.charAt(3);
		}
		for(int i=0; i<num1.length(); i++) {
			pass2 = pass + num1.charAt(5) + num1.charAt(8);
		}
		return pass.concat(pass2);
		
	}

}

public class testMain {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean input = false;
		System.out.println("Enter the name: ");
		String str = sc.next();
		sc.nextLine();
        double num;
		do {
			System.out.println("Enter the 10 digit contact number: ");
			   num = sc.nextDouble();
			 for(int i=0; i<num; i++) {
			if (num < 10) {
				System.out.println("Enter again: ");
				input = false;
			} else {
				input = true;

			}
			 }
		} while (input==true);
		
		Check check = new Check("hemant", 7009);
		
		System.out.println(check.generatePassword(str, num));;

	}

}

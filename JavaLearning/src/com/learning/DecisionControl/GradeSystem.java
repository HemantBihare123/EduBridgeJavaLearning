package com.learning.DecisionControl;

import java.util.Scanner;

public class GradeSystem {
	
	public static String grade(int num) {
		if(num<60 && num>0) {
			return "F";
		}else if(num>=60 && num<=62) {
			return "D-";
		}else if(num>=63 && num<=66) {
			return "D";
		}else if(num>=67 && num<=69) {
			return "D+";
		}else if(num>=70 && num<=72) {
			return "C-";
		}else if(num>=73 && num<=76) {
			return "C";
		}else if(num>=77 && num<=79) {
			return "C+";
		}else if(num>=80 && num<=82) {
			return "B-";
		}else if(num>=83 && num<=86) {
			return "B";
		}else if(num>=87 && num<=89) {
			return "B+";
		}else if(num>=90 && num<=92) {
			return "A-";
		}else if(num>=93 && num<=100) {
			return "A";
		}
		else {
			return "Invalid Input";
		}	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number between 1 to 100: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(grade(num));
	}

}

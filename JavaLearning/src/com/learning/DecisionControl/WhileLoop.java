package com.learning.DecisionControl;

import java.util.Scanner;

public class WhileLoop {
	public static String reverseNum(int num) {
		int rem =0, sum=0;
		
		while(num>0) {
		  rem =(num%10);
		  sum =(sum)+rem;
		  num = num/10;
		}
		return "Reversed number is: "+sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(reverseNum(num));;
	}

}

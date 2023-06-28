package com.learning.DecisionControl;

public class Sumofdigits {

	public static void sum(int num) {
		int sum = 0, rem=0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		sum(num);
	}

}

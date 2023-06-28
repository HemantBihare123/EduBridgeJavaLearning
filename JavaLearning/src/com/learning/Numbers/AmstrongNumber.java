package com.learning.Numbers;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 1634;

		int temp = num;
		
		int rem = 0;
		int sum = 0, count = 0;

		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		
		temp = num;

		System.out.println(count);
		while (num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, count);

			num = num / 10;

		}

		if (temp == sum) {
			System.out.println("Armstrong number: " + temp);
		} else {
			System.out.println("Not Armstrong number: " + temp);
		}
		
		String s = "123";
		Integer x = Integer.valueOf(s);
		
		int y = x;
		System.out.println(y);
		
		float value = 12.03f;
		int convert = (int)value;
		System.out.println(convert);
		
		int number = 100;
		float change = number;
		System.out.println(change);
		

	}

}

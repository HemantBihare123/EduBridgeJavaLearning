package com.learning.Arrays;

public class EvenAndOdd {

	public static void evenOdd(int[] arr) {
		int[] result = new int[arr.length];
		for (int i=0; i<arr.length; i++ ) {
			if (arr[i] % 2 == 0) {
				result[i] = result[i] +arr[i];
			}
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 21, 25, 26, 28, 12 };

		evenOdd(arr);

	}
}


//1.WAP to find the sum of digits of an array
//2.WAP to count the even numbers and odd numbers;
//3.WAP to find the key element from an array and print index position.
//4.WAP to find the minimum and maximum element from an array
//5.WAP to find the pair of element whose sum is equals to key

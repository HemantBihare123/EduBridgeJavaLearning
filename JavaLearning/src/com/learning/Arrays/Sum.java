package com.learning.Arrays;

public class Sum {
	
	public static void sumofdigits(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		sumofdigits(arr);
		

	}

}

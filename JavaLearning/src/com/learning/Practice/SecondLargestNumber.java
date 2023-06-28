package com.learning.Practice;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static int find(int[] arr) {
		 Arrays.sort(arr);
		 int result =0;
		 
			 result = arr[arr.length-2];
		 
		 
		return result;
		
	}

	public static void main(String[] args) {
		int[] arr = {2,3,10,4,5,7,9};
		System.out.println(find(arr));
	}

}

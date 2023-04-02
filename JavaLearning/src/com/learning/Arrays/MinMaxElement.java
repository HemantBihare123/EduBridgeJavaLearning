package com.learning.Arrays;

import java.util.Scanner;

public class MinMaxElement {
	
	public static String min_max(int[] arr) {
		int max=0;
		int min= arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min =arr[i];
			}
			
		}
		return "Max element in array is: " + max
				+"\n"	+"Max element in array is: " + min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array: ");
		int x = sc.nextInt();
		int[] arr = new int[x];
		System.out.println("Please enter the array element ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
//		int[] arr= {2,3,4,1,7,9,8};
		System.out.println(min_max(arr));
		

	}

}

package com.learning.Arrays;

import java.util.Scanner;

public class KeyElementFinder {
	
	public static void keyFinder(int[] arr ,int key) {
		String str="";
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==key) {
			  str= "Key found at index :" + i;
			  break;
				
			}
			else {
			str ="Key not found in array";
			}
		
			
		}
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of array: ");
		int x= sc.nextInt();
		int[] arr = new int[x];
		System.out.println("Please enter array: ");
		for(int i=0; i<x; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("Please enter the key: ");
		int y = sc.nextInt();
		
		
		
		// TODO Auto-generated method stub
		
//		int[] arr= {1,2,34,5,7};
		keyFinder(arr, y);
		
		

	}

	

}

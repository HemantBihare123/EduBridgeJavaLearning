package com.learning.Arrays;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void prime(int[] arr) {
		System.out.println("Prime number is: ");
		int flag=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=2; j<=arr[i]/2; j++) {
				if(arr[i]%j!=0) {
					flag++;
				}else {
					flag=0;
				}
			}if(flag!=0 && arr[i]>1) {
				System.out.print(arr[i]+ " ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int x = sc.nextInt();
		int[] a= new int[x];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		sc.close();
		prime(a);
		
	}

}

package com.learning.Arrays;

public class CubeofNumber {
	
	public static void cube(int[] a) {
		int[] result = new int[a.length];
		for(int i=0; i<a.length; i++) {
			result[i] =result[i] + a[i]*a[i]*a[i];
		}
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] +" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		cube(arr);
	}

}

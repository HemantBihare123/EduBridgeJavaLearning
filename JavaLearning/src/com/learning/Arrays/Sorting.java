package com.learning.Arrays;

public class Sorting {
	
	public static void sort(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1,3,7,8,9,0};
		sort(arr);

	}

}

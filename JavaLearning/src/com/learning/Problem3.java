package com.learning;

public class Problem3 {
	
	public static void removeDuplicates(int[] arr) {
		int rd = arr[0];
		for(int i=1; i<arr.length; i++) {
				if(arr[rd]!=arr[i]) {
					arr[rd] =arr[i];
					  rd++;
				}
			}
		
		System.out.println(rd);
		System.out.println("------------");
		for(int i=0; i<arr[rd+1]; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,5};
		removeDuplicates(arr);
	}

}

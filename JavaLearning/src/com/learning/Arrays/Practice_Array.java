package com.learning.Arrays;



public class Practice_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 3, 4, 5 };
        int[] temp = new int[arr.length];
		int rd = 0;

		for(int i=1; i<arr.length; i++) {
			if(arr[rd]!=arr[i]) {
				rd++;
				arr[rd]=arr[i];
			}
		}
		int result = arr[rd];
		for(int i=0; i<arr.length-2; i++) {
			System.out.print(arr[i]);
		}

	}

}

package com.learning.Arrays;

public class MySortingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5,1,8,3,8,9,4,6,0,2 };
		int length = arr.length;
		for (int j = 0; j < length - 1; j++) {
			 
            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {
 
                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
 
                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }
 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}

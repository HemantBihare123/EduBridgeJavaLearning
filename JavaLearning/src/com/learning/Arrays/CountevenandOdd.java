package com.learning.Arrays;

public class CountevenandOdd {
	
	public static void countEvenandOdd(int[] arr){
		int even =0;
		int odd =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
				
			}else {
				odd++;
			}
		}System.out.println("Total number of evens: " +even + '\n' + "Total number of odd: " +odd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,6,7};
		countEvenandOdd(arr);

	}

}

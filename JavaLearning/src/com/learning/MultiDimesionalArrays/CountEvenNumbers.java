package com.learning.MultiDimesionalArrays;

public class CountEvenNumbers {
	public static String count_even_odd(int[][] arr){
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%2==0) {
					count++;
				}
			}
		}return(count%2==0)?"even " + count:"odd "+count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,4,6},{22,23,24},{45,46,48}};
		System.out.println(count_even_odd(arr));;
	}

}

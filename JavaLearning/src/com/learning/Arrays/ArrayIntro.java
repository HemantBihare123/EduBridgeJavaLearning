package com.learning.Arrays;


//Indexed Collection of fixed size of homogeneous type of data
// elements
public class ArrayIntro {

	public static void main(String[] args) {
		int[] arr ;  // declaration of array
		arr = new int[10]; //instantiation of array
		arr[0] = 10;    // initialization of array
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int[] arr1 = new int[10];
		arr[0] =10;
		arr[1] =20;
		

		int[] arr3 = {10,20,30,40,50};
		
		int[] arr4 = {10,22,70,45,50,8,60};
		
		int minValue = arr4[0];
		for(int i=1; i<arr4.length; i++) {
			if(minValue>arr4[i]) {
				minValue=arr4[i];
			}
		}
		System.out.println("Min Value: "+ minValue);
	}

}

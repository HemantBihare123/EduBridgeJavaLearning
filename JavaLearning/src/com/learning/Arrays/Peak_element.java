package com.learning.Arrays;

public class Peak_element {
// Find a peak element which is not smaller than its neighbours.

//	Input: array[]= {5, 10, 20, 15}
//	Output: 20
//	Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

	public static String peak_element(int[] arr) {
		int result = 0;
		int index = 0;
		if(arr.length==0)
			return 0+"";
		if(arr.length==1)
			return arr[0]+"";
		if(arr.length==2) {
			return(arr[0]>arr[1])?arr[0]+"":arr[1]+"";
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				result = arr[i];
				index = i;
			}
			if (arr[i] >= arr[i - 1] || arr[i] >= arr[i + 1]) {
				result = arr[i];
				index = i;
			}
		}
		return "Peak element is: " + result + '\n' + "Index of peak element is: " + index;

	}

	public static void main(String[] args) {
		int[] arr = {10, 20};
		System.out.println(peak_element(arr));

	}

}

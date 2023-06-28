package com.learning;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {

	public static void findMissingNumber(int arr[]) {
		Set<Integer> set = new HashSet<Integer>();
		int min =  arr[0];
		int max = 0;
		for (int i : arr) {
			if (i < min) {
				min = i;
			}

			if (i > max) {
				max = i;
			}
			set.add(i);

		}

		for (int i = min; i < max; i++) {
			if (!set.contains(i)) {
				set.add(i);
			}
		}
		
		System.out.println(set);

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3,  10 };
		findMissingNumber(arr);

	}

}

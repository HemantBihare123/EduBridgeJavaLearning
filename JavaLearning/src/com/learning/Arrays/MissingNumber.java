package com.learning.Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MissingNumber {
	
	public static Set<Integer> findingMissingNumber(int[] array) {
		Set<Integer> set = new HashSet<Integer>();
		int min= array[0];
		int max =0;
		for(int arr: array) {
			if(arr<min) {
				min = arr;
			}
			if(arr>max) {
				max=arr;
			}
			set.add(arr);
		}
		
		
		for(int i=min; i<max; i++) {
			if(!set.contains(i)) {
				set.add(i);
			}
		}
		
		return set;
	}

	public static void main(String[] args) {
		int[] array = {4,3,5,9,17};
		
		Set<Integer> set =findingMissingNumber(array);
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}

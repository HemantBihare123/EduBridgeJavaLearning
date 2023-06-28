package com.learning.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfOne {
	
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,12,3,1,1,3};
	Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
	for(int i=0; i<arr.length; i++) {
		int num = arr[i];
		if(hashmap.containsKey(num)) {
			hashmap.put(num, hashmap.get(num)+1);
		}else{
			hashmap.put(num, 1);
		}
	}
	System.out.println(hashmap);
	
	System.out.println("-----------------------------------------");
	
	//using for loop
	System.out.println("Using for loop");
	int[] arr2= {1,2,3,4,5,2,5,2,5,2,23,1,3};
	Map<Integer, Integer> count = new HashMap<Integer, Integer>();
	for(int i=0; i<arr2.length; i++) {
		if(count.containsKey(arr2[i])) {
			count.put(arr2[i], count.get(arr2[i])+1);
		}else {
			count.put(arr2[i], 1);
		}
	}
	System.out.println(count);
	
	
	System.out.println("--------------------------------------------------");
	// using for each loop
	System.out.println("Using for each loop");
	int[] array = {1,2,3,4,2,42,4,1,3,34,2,42,4,4};
	Map<Integer, Integer> counting = new HashMap<Integer, Integer>();
	for(int num : array) {
		if(counting.containsKey(num)) {
			counting.put(num, counting.get(num)+1);
		}else {
			counting.put(num, 1);
		}
	}
	System.out.println(counting);
	
	
	
	}
}

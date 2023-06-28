package com.learning.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommanElements {
	
	public static List<Integer> commonElements(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr1) {
			set.add(i);
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i : arr2) {
			if(set.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,5,6,7,0};
		int[] arr2 = {2,5,3,4,1,6,0,7};
		System.out.println(commonElements(arr1, arr2));
	}

}

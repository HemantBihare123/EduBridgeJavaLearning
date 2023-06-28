package com.learning.Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
	
	
	public static Set<Integer> removeDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		
		return set;
	}
	
	public static String findDuplicate(int[] arr) {
		StringBuilder sb = new StringBuilder();
//		String result="";
		for(int i=0;  i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					sb.append(arr[j]).append(" "); 
				}
			}
		}
		
		return sb.toString();
		
	}
	
	

	public static void main(String[] args) {
	 int[] arr = {1,4,2,3,4,2,5,1};
	 for(int i :arr) {
		 System.out.print("["+i+"]");
	 }
	 System.out.println();
	 System.out.println(removeDuplicate(arr));
	 System.out.println(findDuplicate(arr));

	}

}

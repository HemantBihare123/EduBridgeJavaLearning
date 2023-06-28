package com.learning.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionProblem {

	public static List<String> unique(String[] arr) {
//		Set<String> set = new HashSet<String>();
//		for (String i : arr) {
//			set.add(i);
//		}
//		List<String> list = new ArrayList<String>(set);
//
//		Collections.sort(list, new Comparator<String>() {
//								   
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			}
//
//		});
//		return list;
		
		
		Set<String> set = new TreeSet<String>();
		Collections.addAll(set, arr);
		List<String> list = new ArrayList<String>(set);
		return list;

	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of String you want to enter: ");
//		int number = sc.nextInt();
//		String[] arr = new String[number];
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter " + (i + 1) + " String: ");
//			arr[i] = sc.next();
//
//		}
//		sc.close();
		
		String[]  arr = {"Apple", "Banana", "Grapes", "Apple", "Fruits"};
		System.out.println(unique(arr));
		
	}

}

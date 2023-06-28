package com.learning.Arrays;

import java.util.HashSet;
import java.util.Set;

public class VaishnaviMissingNoConcept {

	public static Set<Integer> find(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i : arr) {
			set.add(i);
		}

		for (int i = 1; i <= 10; i++) {
			if (!set.contains(i)) {
				set2.add(i);
			}
		}

		return set2;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 7 };
		System.out.println(find(arr));

	}

}

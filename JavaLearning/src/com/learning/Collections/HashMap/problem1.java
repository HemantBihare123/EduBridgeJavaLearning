package com.learning.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class problem1 {
	public static void main(String[] args) {
		int[] arr = { 6, 4, 5, 5, 5, 6, 4, 4, -1, -1, 11, 11, 10, 0 };
		// {}
		int sum = 10;
		HashMap<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (mp.get(arr[i]) == null) {
				mp.put(arr[i], 1);
			} else {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
		}
		for (Map.Entry e : mp.entrySet()) {

			if ((int) e.getKey() * 2 == sum) {
				int count = (int) e.getValue() / 2;
				while (count > 0) {
					System.out.println(e.getKey() + " " + e.getKey());
					count -= 1;
				}
				continue;
			}
			if (mp.get(sum - (int) e.getKey()) != null) {
				int count = (int) e.getValue() / 2;
				int min = ((int) e.getValue() > (int) (mp.get(sum - (int) e.getKey())))
						? (int) (mp.get(sum - (int) e.getKey()))
						: (int) e.getValue();
				while (min > 0) {
					System.out.println(e.getKey() + " " + (sum - (int) e.getKey()));
					min -= 1;
				}

				mp.put((int) e.getKey(), 0);
			}
		}
	}
}
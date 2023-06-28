package com.learning.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DescOrderFrequency {

	public static String descFreq(String str) {
		str =str.replaceAll("\\s", "");
		str = str.toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char count : str.toCharArray()) {
			if (map.containsKey(count)) {
				map.put(count, map.get(count) + 1);
			} else {
				map.put(count, 1);
			}
		}
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

				return o2.getKey().compareTo(o1.getKey());
			}
		});

		return list.toString();

	}

	public static void main(String[] args) {
		String str = "Hello Hemant Bihare";
		
		System.out.println(str);
		System.out.println("Word Frequency count and sotring in descending order: ");
		System.out.println(descFreq(str));
	}

}

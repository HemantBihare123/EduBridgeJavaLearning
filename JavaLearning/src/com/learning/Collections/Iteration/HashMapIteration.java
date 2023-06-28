package com.learning.Collections.Iteration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {
		
		String[] str = {"Hemant", "Bihare", "Hemant", "Rohan"};
		Map<String, String> map = new HashMap<String, String>();
		for(String count: str) {
			map.put(count, map.get(count));
		}
		
		
		
		for(Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}


	}

}

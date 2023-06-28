package com.learning.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ankit", "Harsh", "Vishal", "Rohan");
		boolean result =names.stream().allMatch(obj -> obj.startsWith("A"));
		
		names.stream()
		.findAny();
		
		System.out.println(result);

	}

}

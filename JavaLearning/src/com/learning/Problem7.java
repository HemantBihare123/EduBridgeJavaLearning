package com.learning;

import java.util.HashMap;
import java.util.Map;

public class Problem7 {
	
	public static  void countduplicate(String str) {
		
		String result = "";
		Map<Character, Integer>  map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(i)+1);
			}else {
				map.put(str.charAt(i), 1);
				
			}
			
		}
		
		//for(map.entrySet(map))
		
		
	}
	
	
	
	public static void main(String[] args) {
		//removeChar("wikipedia");

	}

}

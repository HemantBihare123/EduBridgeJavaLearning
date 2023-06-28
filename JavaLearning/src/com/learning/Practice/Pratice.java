package com.learning.Practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//One string name and contact number. generate password
//2 and 4 from name and 6 and 9 from contact number. Contact number should be of 10 digit	


public class Pratice {
	
	public static List<String> wordOccurance(String str){
		String[] split = str.split(" ");
		Map<String,Integer>  map = new HashMap<String,Integer>();
		
		for(String s : split) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
			List<String> list = new ArrayList<>();
			for(Entry<String, Integer> entry : map.entrySet()) {
				list.add(entry.getKey()+" = "+entry.getValue());
			}
			return list;
			
		
	}

	public static void main(String[] args) {
		
		String str = "Hello this is hemant from chhindwara this is my place";
		System.out.println(wordOccurance(str));
	}	

}

package com.learning.String;

import java.util.HashMap;
import java.util.Map;

class Printing {

	public static int CharacterCount(String str) {
		str = str.replaceAll("\\s", "");
		return str.length();

	}

	public static int NumberOfWordsCount(String str) {
		String[] split = str.split(" ");
		int count = 0;
		for (String counting : split) {
			count++;
		}
		return count;

	}

	public static int VowelCount(String str) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;

	}
	
	public static String FrequencyCount(String str) {
		//str = str.replaceAll(" ", "");
		Map<Character,Integer> map = new HashMap<Character,Integer>(); 
		for(char count : str.toCharArray()) {
			if(map.containsKey(count)) {
				map.put(count, map.get(count)+1);
			}else {
				map.put(count, 1);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
		}
		
		return sb.toString();
		
		
	}
	
	public static String UppercaseCount(String str) {
		String output="";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				output += str.charAt(i)+" ";
				count++;
			}
		}
		
		return output+" = "  +count;
		
	}
	
}

public class WordsVowelsFrequency {

	public static void main(String[] args) {
		String str = "Hemant Bihare Hello";
		System.out.println(Printing.CharacterCount(str));
		System.out.println(Printing.NumberOfWordsCount(str));
		System.out.println(Printing.VowelCount(str));
		System.out.println(Printing.FrequencyCount(str));
		System.out.println(Printing.UppercaseCount(str));

	}

}

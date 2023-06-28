package com.learning.String;

public class EvenLengthWords {
	
	public static String EvenLengthWordsCount(String str) {
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : split) {
			if(s.length()%2==0) {
				sb.append(s).append(" ");
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		String str = "Hello this is hemant bihare from company name Hoonartek";
		System.out.println(EvenLengthWordsCount(str));
	}

}

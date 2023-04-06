package com.learning.String;

public class Vowels {
	
	public static int vowels(String str) {
		
		str =str.toLowerCase();
		char[] ch =str.toCharArray();
		int count =0;
		for(int i=0; i<str.length(); i++) {
			if(ch[i] =='a' ||ch[i] =='e' || ch[i] =='i'||ch[i]=='o'|| ch[i]=='u') {
				count++;
			}
		}return count;
		
		
	}
	
//	for(int i =0; i<str.lenght(); i++){
//		char ch = str.charAt(i);
//		if(ch[i] =='a' ||ch[i] =='e' || ch[i] =='i'||ch[i]=='o'|| ch[i]=='u') {
//			count++
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Encyclopedia";
		System.out.println(vowels(str));
		

	}

}

package com.learning.String;

public class FirstWordCaps {

	public static String caps(String str) {
		String[] split = str.split(" ");
		String result = "";
		for (String words : split) {
			result = result + words.toUpperCase().charAt(0) + words.substring(1).concat(" ");
		}
		return result;
	}

	public static void capital(String str) {
		String[] split = str.split(" ");
		String result = "";
		for (String words : split) {

			if ((int) words.charAt(0) >= 97 && (int) words.charAt(0) <= 122) {
				result = result + (char) ((int) words.charAt(0) - 32) + words.substring(1);
			} else {
				result = result + words.charAt(0) + words.substring(1);
			}

			result = result + " ";
		}
		System.out.println(result);
	}

	public static void capital_letters(String str) {
		String[] split = str.split(" ");
		char[] ch = str.toCharArray();
		String result = "";
		String res = "";
		
		
//			System.out.println(words);
			for (int i = 0; i < str.length(); i++) {
				
				//System.out.print(split[i]+" ");
				
				if ((int)ch[0] >= 97 && (int)ch[0]  <= 122) {
					result = result +((char)((int)ch[0]-32))+str.substring(1);
				}else {
					result = result+ ch[0];
				}


			}System.out.println(result);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java is popular programming Language";
		System.out.println(caps(str));
		capital(str);
		capital_letters(str);

	}

}

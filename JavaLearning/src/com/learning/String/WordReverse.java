package com.learning.String;



public class WordReverse {
	
	public static String reverse(String str) {
		String[] split = str.split(" ");
		String result="";
		for(String word:split) {
			for(int i=word.length()-1; i>=0; i--) {
				result = result+word.charAt(i);
			}result = result+" ";
		}return result;
	}
	
	public static String in_built_reverse(String str) {
		String result="";
		String[] split = str.split(" ");
		for(String word: split) {
		 result = result + new StringBuffer(word).reverse().append(" ");
		 
		}
		return result;
	}
	public static StringBuffer built_reverse(String str) {
		
		String[] split = str.split(" ");
		StringBuffer result = new StringBuffer();
		for(String word: split) {
			result = result.append(new StringBuffer(word).reverse().append(" "));
			
		}return result; 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the String: ");
//		String str = sc.nextLine();
		String str = "Hemant is working";
		System.out.println(reverse(str));
		System.out.println(in_built_reverse(str));
		System.out.println(built_reverse(str));
		
		
	}

}

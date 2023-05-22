package com.learning.Numbers;

class PrimeFinder {
	
	static int staticnum;
	
	{
		staticnum=10;
	}

	public static void main(String[] args) {
		int num = 120;
		float result = num;
		
		byte num1 = 127;
		int num2 = num1;
		char ch = 'a';
		String str = String.valueOf(ch);
		
		byte lowercasting = (byte)num; 
		
		String str2 = "a";
		char ch1 = str2.charAt(0);
		
		System.out.println(result);
		System.out.println(num2);
		System.out.println(str);
		System.out.println(lowercasting);
		System.out.println(ch1);
		
		
		
	}

}

package com.learning.Numbers;

public class Palindrome {
	
	public static boolean isPalindrome(int x) {
		int rem, sum=0;
		int temp=x;
		while(x>0) {
			rem = x%10;
			sum = sum*10+rem;
			x=x/10;
		}return(sum==temp)?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =122;
		System.out.println("Number is palindrome: "+x+"\n"+isPalindrome(x));

	}

}

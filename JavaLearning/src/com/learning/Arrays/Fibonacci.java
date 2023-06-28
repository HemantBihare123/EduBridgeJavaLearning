package com.learning.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		
		long previous_result=1;
		long current_result =1;
		long result=0;
		  System.out.print(previous_result+","+current_result);    
		 
		
			for(long i=0; i<=10; i++) {
			
			result = previous_result + current_result;
			previous_result = current_result;
			current_result = result;
			System.out.print(","+result);
			
		
			}
		
	}

}

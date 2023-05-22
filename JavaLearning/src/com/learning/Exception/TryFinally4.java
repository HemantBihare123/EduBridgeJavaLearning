package com.learning.Exception;

class Demo4{
	public static void show() {
		try {
			int result =12/12;   //Arithmetic 
			try {
				   String str=null;
				   System.out.println(str.toLowerCase());
			}catch(ArithmeticException npee) {
			
				System.out.println("Inner catch block handled the exception");
			}
			finally {
				System.out.println("Inner finally block");
			}
		
		
		
		}catch(Exception e) {
		//catch(Exception e) {
			System.out.println("Exception handled..");
		}
		finally {
			System.out.println("db close");
		}
		
	}
}

public class TryFinally4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4.show();

	}

}

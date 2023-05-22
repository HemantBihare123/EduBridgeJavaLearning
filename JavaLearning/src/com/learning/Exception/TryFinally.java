package com.learning.Exception;

// finally block: if exception occured in try block and if we handle 
// or dont handle, even in that case block of code present inside the 
// finally will get executed
class Demo{
	public static void show() {
		try {
			int result =12/0;   //Arithmetic 
		}catch(NullPointerException e) {
		//catch(Exception e) {
			System.out.println("Exception handled..");
		}
		finally {
			System.out.println("db close");
		}
		
	}
}


public class TryFinally {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.show();

	}

}

package com.learning.Exception;


class Demo3{
	public static void show() {
		try {
			int result =12/0;   //Arithmetic 
			try {
				   String str=null;
				   System.out.println(str.toLowerCase());
			}catch(NullPointerException npee) {
			
				System.out.println("Inner catch block handled the exception");
			}
			finally {
				System.out.println("Inner finally block");
			}
		
		
		
		}catch(NullPointerException e) {
		//catch(Exception e) {
			System.out.println("Exception handled..");
		}
		finally {
			System.out.println("db close");
		}
		
	}
}
public abstract class TryFinally3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3.show();

	}

}

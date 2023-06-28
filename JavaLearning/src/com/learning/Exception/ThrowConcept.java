package com.learning.Exception;


//throw keyword is used to create a custom exception .
//with the help of throw we can create custom exception and 
//can pass to the JVM.


public class ThrowConcept {
//	case1
//	static ArithmeticException e = new ArithmeticException();
//	case2
	static ArithmeticException e;  //here e is refering to null
	public static void main(String[] args) {
	   throw e;
   }
}

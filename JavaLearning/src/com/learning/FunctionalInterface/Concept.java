package com.learning.FunctionalInterface;


/*
   A Functional Interface is an Interface which allows only one Abstract method 
   within the Interface scope. 
   There are some predefined functional interface in Java like Predicate, consumer, supplier etc.
   The return type of a Lambda function (introduced in JDK 1.8) is a also functional interface.
   
  
   
   Java Predicate Interface
   It is a functional interface which represents a predicate 
   (boolean-valued function) of one argument. 
   It is defined in the java.util.function package and contains test() a functional method.
   
   
   Consumer<T>
	Consumer<T> is used when we have to provide some input parameter, 
	perform certain operation, but don’t need to return anything.
 	Moreover, we can use Consumer to consume object and perform certain operation.
 	
 	
 	Supplier<R>
    Supplier<R> doesn’t take any input and it always returns some object. 
	However, we use it when  we need to get some value based on some operation 
  	like supply Random numbers,  supply Random OTPs, supply Random Passwords etc. 
 */
public class Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

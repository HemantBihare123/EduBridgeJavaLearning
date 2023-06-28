package com.learning.Interface;

//methods:
//concrete: function with body
//abstract: function without body
// Interface can't be instantiated, but we can have
// reference type



//Interface can have 
//abstract methods
// concerete methods with default keyword
// static methods
// object creation is not allowed
interface X{
	
	void m1(); //by default --->abstract
	
	private void m2() {
		
	}
}

class Y implements X{

	@Override
	public void m1() {
		System.out.println("m1() implemented in Y");
		
	}
	
}

class Z implements X{

	@Override
	public void m1() {
		System.out.println("m1() implemented in Y");
		
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y = new Y();
		y.m1();

	}

}

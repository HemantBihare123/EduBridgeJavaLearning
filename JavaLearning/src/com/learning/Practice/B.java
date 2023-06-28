package com.learning.Practice;

 class A{
	public A(){
		
		System.out.println("THis is default cons..");
	}
	
	public A(int a) {
		this();
		System.out.println("This is parameterized cons..");
	}
}
public class B extends A {
	
	B(){
		super(10);
		System.out.println("THis is B cons...");
	}
   public static void main(String[] args) {
	   B b = new B();
   }
}

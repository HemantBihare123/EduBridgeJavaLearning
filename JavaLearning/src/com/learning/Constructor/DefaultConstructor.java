package com.learning.Constructor;

class A{
	int data =100;
	//Default constructor
	A(){};
	
}

class B{
	
	static int count =0;
	B(){
		count++;
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		System.out.println(B.count);
		
		

	}

}

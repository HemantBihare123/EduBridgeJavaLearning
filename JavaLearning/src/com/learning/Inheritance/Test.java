package com.learning.Inheritance;

class Base extends Object{
	int b=20;
	Base(){
		System.out.println("Base class constructor");
	}
	
	
}

class Derived extends Base{
	int a =10;
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Derived derived = new Derived();
			Base base = new Base();
			
	}

}

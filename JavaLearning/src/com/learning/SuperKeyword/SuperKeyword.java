package com.learning.SuperKeyword;

//Use 1:
//  super keyword is also reference variable which is used to refer
//  to immediate parent class object.

class A{
	int a = 10;
	
}

class B extends A{
	int a = 20;
	
	void show(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
}


public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show(30);

	}

}

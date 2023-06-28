package com.learning.SuperKeyword;



//  1. super keyword can be used to refer immediate
//     parent class instance varaible.
//  2. super keyword can be used to invoke immediate
//     parent class method
//  3. super() can be used to invoke immediate 
//     parent class constructor.


class One{
	void m1() {
		System.out.println("I m in class A");
	}
}

class Two extends One{
	void m2() {
		super.m1();
		System.out.println("I m in class B");
	}
}
public class SuperKeywordUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj = new Two();
		obj.m2();
		obj.m1();
		

	}

}

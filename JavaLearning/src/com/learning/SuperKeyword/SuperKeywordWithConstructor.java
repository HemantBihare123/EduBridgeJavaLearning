package com.learning.SuperKeyword;


class A1{
	A1(){
		System.out.println("I'm in A1");
	}
	
	A1(int a){
		System.out.println("A1 parameterized: " +a);
	}
}

class B1 extends A1{
	
	B1(){
		super(10);
		System.out.println("I'm in B1");
	}
}




public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		
	}

}

package com.learning.Constructor;


class A1{
	A1(){
		System.out.println("No-arg constructor");
	}
	A1(int data){
		System.out.println("Parameterized Constructor");
	}
}


public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
	}

}

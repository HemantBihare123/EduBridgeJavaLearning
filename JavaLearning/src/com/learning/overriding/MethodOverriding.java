package com.learning.overriding;


class X{
	public void m1() {
		System.out.println("m1() called");
	}
}

class Y extends X{
	@Override
	public void m1() {
		System.out.println("m1() called from Y");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Y y = new Y();
		y.m1();

	}

}

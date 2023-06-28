package com.learning.Thiskeyword;


//Use 4:
// this keyword can be used to pass as an argument in the method call
public class FourthUse {
	
	void m1(FourthUse obj) {
		System.out.println("This is method 1");
	}
	void m2() {
		m1(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FourthUse obj = new FourthUse();
			obj.m2();
	}

}

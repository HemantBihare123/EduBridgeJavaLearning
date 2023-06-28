package com.learning.Inheritance;


// 1. IS-A relationship
// 2. code reuseability
// 3. extends keyword


class P{
	
	protected void method1() {
		System.out.println("Parent");
	}
}

class C extends P{
//	child have two method
	protected void method2() {
		System.out.println("Child");
	}
}



public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new P();
		p.method1();
		System.out.println("-------------------");
//		p.method2(); error
		C c =new C();
		c.method2();
		c.method1();
		System.out.println("---------------------------");
		P p1 =new C(); // Parent class reference can be use to 
		               // call child class object
		p1.method1();
//		p.method2();  error 
//		              We can you refernce but cannot call
//		              child class method or variable
		System.out.println("--------------------------------");
//		C c1 = new P();  error child refernce cannot to use to call
//		                 parent class object
		
	}

}

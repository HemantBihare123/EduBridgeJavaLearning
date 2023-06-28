package com.learning.Inheritance;


class Parent{
      int a=1;
      void method(int a) {
    	  System.out.println(this.a);
      }
      
}
class Child extends Parent{
	int b=4;
	void method2(int b) {
		System.out.println(this.b);
	}
	
}
class Grandchild extends Child{
	int c=9;
	void method3(int c) {
		System.out.println(this.c);
	}
	
}


public class MultilevelCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grandchild c = new Grandchild();
		c.method3(10);
		c.method(4);
		c.method2(4);
		System.out.println(c.a);

	}

}

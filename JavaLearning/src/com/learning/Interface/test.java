package com.learning.Interface;

import com.learning.Inheritance.TestingProtected;

public class test extends TestingProtected{
	
	       protected void method1() {
	    	   System.out.println("Hi");
	       }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          test t  = new test();
          t.method1();
	}

	}

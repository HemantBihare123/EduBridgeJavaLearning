package com.learning.Static;


// Static blocks or static initializer blocks are used 
// for initializing static fields in java.


// Static blocks get executed exaclty once when the class
// is loaded.

// A class can have any number of static blocks.

// Static blocks get executed in the order we placed them in the 
// source code.

// Static blocks get executed even before the constructors
// of the class get executed.

public class StaticBlockIntro {
      static int num;
      
      public int getNum() {
    	  System.out.println(num=5);
    	  return num=5;
      }
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockIntro intro = new StaticBlockIntro();
		intro.getNum();
		System.out.println(StaticBlockIntro.num);;
	}

}

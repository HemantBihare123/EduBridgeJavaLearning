package com.learning.Thiskeyword;

//Use 3:
// this() keyword can be used to invoke current class constructor.

public class ThirdUse {
	
	ThirdUse(){
		this(10);
		System.out.println("no args constructor");
		
	}
	
	ThirdUse(int a){
		//this();
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdUse obj = new ThirdUse();
		

	}

}

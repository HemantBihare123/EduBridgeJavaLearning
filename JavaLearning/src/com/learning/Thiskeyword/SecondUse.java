package com.learning.Thiskeyword;

//Use2
//this keyword can be used to invoke current class method(implicitly)
public class SecondUse {
	
	void display() {
		System.out.println("hello");
	}
	
	void show() {
		display(); // if you dont use the this keyword, complier
                   //automatically adds this keyword while invoking
                   //the method.
		
		this.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondUse obj = new SecondUse();
		obj.show();

	}

}

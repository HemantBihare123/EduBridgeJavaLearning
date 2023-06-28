package com.learning.MethodReference;


//Refering the static method

@FunctionalInterface
interface Display{
	void show();
}

class ShowUtil{
	public static void m1() {
		System.out.println("static method is called...");
	}
}
public class Test3 {

	public static void main(String[] args) {
		Display display = ShowUtil::m1;
		display.show();
	}

}

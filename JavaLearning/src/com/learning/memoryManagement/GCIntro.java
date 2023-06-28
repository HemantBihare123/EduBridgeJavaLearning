package com.learning.memoryManagement;


class Demo{
	@Override
	public void finalize() {
		System.out.println("Object removed");
	}
}
public class GCIntro {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d = new Demo();
		System.gc();
		System.out.println("Program terminates");
	}

}

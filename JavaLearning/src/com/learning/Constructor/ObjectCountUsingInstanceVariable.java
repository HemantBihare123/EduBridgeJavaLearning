package com.learning.Constructor;

public class ObjectCountUsingInstanceVariable {
	int count =0;
	ObjectCountUsingInstanceVariable(){
		count++;
	}
	
	void getcount(){
		System.out.println(this.count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCountUsingInstanceVariable obj1 = new ObjectCountUsingInstanceVariable();
		ObjectCountUsingInstanceVariable obj2 = new ObjectCountUsingInstanceVariable();
		ObjectCountUsingInstanceVariable obj3 = new ObjectCountUsingInstanceVariable();
		System.out.println(obj3.count);
	}

}

package com.learning.mutableStringBuffer;

public class StringBuffer_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. StringBuffer(str)
		StringBuffer sb = new StringBuffer("Java");
		//StringBuffer()
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		//StringBuffer(int);
		StringBuffer sb2 = new StringBuffer(4);
		System.out.println(sb2.capacity());
		sb2.append("Hemant");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		//initial capacity=16
		//new capacity =(oldCapacity *2)+2
	}

}

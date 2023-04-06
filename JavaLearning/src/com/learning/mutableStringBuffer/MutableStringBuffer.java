package com.learning.mutableStringBuffer;

public class MutableStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("Code");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		

	}

}

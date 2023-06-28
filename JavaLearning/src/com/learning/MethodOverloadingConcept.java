package com.learning;

public class MethodOverloadingConcept {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;

	}
	
	public float sum(float a, float b) {
		return (a+b);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingConcept method = new MethodOverloadingConcept();
		System.out.println(method.sum(10, 20));
		System.out.println(method.sum(20f, 30f));
		System.out.println(method.sum(10, 20, 30));
		

	}

}

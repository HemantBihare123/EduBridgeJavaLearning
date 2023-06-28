package com.learning.Constructor;

class Vehicle{
	 void Vehicle(){
		System.out.println("Inside constructor");
	}
	
}
	

public class ConstructorIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike = new Vehicle();
		System.out.println(System.identityHashCode(bike));
		
	}

}

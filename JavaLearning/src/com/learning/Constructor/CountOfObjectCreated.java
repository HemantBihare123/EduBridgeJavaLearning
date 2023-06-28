package com.learning.Constructor;

//Wap to count no. of object created

public class CountOfObjectCreated {
	static int count=0;
	CountOfObjectCreated(){
		count++;
	}
	
	int count1=0;
	CountOfObjectCreated(int x){
		count1++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfObjectCreated obj1 = new CountOfObjectCreated();
		CountOfObjectCreated obj2 = new CountOfObjectCreated();
		System.out.println(count);
	}

}

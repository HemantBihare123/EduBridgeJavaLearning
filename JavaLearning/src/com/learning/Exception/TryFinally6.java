package com.learning.Exception;

class Demo6{
	@SuppressWarnings("finally")
	public static int show() {
		try {
			int data =15/0;
			
		}catch(Exception e) {
			return 10;
		}finally {
			return 20;
		}
	}
	
}

public class TryFinally6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo6.show());

	}

}

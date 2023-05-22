package com.learning.Exception;


class Demo5{
	@SuppressWarnings("finally")
	public static int show() {
		try {
			int data =15/3;
			
		}catch(Exception e) {
			return 10;
		}finally {
			return 20;
		}
	}
}
public class TryFinally5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Demo5.show();
		System.out.println(result);

	}

}

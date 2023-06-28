package com.learning;

public interface StaticBlocksIn {
	
	class A{
		public int sum(int a, int b) {
			return a+b;
		}
	}

}

class Main implements StaticBlocksIn, Second{
	
	
	public static void main(String[] args) {
		Main main = new Main();
//		System.out.println(new A().sum(10, 50));
//		A a = new A();
//		System.out.println(a.sum(50, 10));
		
		
	}
}

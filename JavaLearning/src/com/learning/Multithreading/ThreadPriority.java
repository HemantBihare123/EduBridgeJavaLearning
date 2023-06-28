package com.learning.Multithreading;


//class MyThread3 extends Thread{
//	
//}

class A extends Thread{
	public void run() {
		System.out.println("A started");
		for(int i=1; i<=5; i++) {
		System.out.println("A =>" + i);
	}
}
}
	class B extends Thread{
		public void run() {
			System.out.println("B started");
			for(int i=1; i<=5; i++) {
				System.out.println("B =>" + i);
			}
		}
	}
		class C extends Thread{
			public void run() {
				System.out.println("C started");
				for(int i=1; i<=5; i++) {
					System.out.println("C =>" + i);
				}
			}
		}
public class ThreadPriority {

	public static void main(String[] args) {
		
//		System.out.println(Thread.currentThread().getName()+" = "+Thread.currentThread().getPriority());
//		MyThread3 t1 = new MyThread3();
//		System.out.println(t1.getPriority());
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		b.setPriority(Thread.MAX_PRIORITY);
		c.setPriority(Thread.MIN_PRIORITY);
		a.setPriority(Thread.NORM_PRIORITY);
		
		
		b.start();
		
		
		a.start();
		
		
		c.start();
		
	}

}
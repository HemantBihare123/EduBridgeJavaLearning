package com.learning.Multithreading;

public class joinIntro extends Thread {
	public void run() {
		printNumber();
	}
	public void printNumber() {
		for(int i=21; i<=45; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		joinIntro t1 = new joinIntro();
		joinIntro t2 = new joinIntro();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Main end");

	}

}

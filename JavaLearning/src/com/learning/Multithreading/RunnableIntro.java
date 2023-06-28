package com.learning.Multithreading;


//Runnable(I)------> run()
// Functional Interface having exactly one abstract class
class MyThread implements Runnable{
	
	@Override
	public void run(){
		System.out.println("Run()is executed...");
	}
	
	// cannot be overload bcz we dont have control over it
//	public void run(int i){
//		System.out.println("Run(10)is executed...");
//	}
	
	
}

public class RunnableIntro {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread th = new Thread(t1);
		th.start();
	//  We call start() twice on same thread
	// 	th.start();  //java.lang.IllegalThreadStateException

	}

}

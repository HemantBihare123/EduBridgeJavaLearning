package com.learning.Multithreading;

class ThreadConcept implements Runnable {
    private static Object lock = new Object();
	int num;

	ThreadConcept(int num) {
		this.num = num;

	}

	public  void multiply(int num) {
		synchronized (lock){
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+": " +num + " X "+ i +" = "+num*i);
			try {
			Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		}
		
	}

	@Override
	public void run() {
		multiply(num);
	}
}

public class MultithreadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadConcept threadConcept1 = new ThreadConcept(2);
		ThreadConcept threadConcept2 = new ThreadConcept(3);
		ThreadConcept threadConcept3 = new ThreadConcept(4);
		ThreadConcept threadConcept4 = new ThreadConcept(5);
		Thread t1 = new Thread(threadConcept1);
		Thread t2 = new Thread(threadConcept2);
		Thread t3 = new Thread(threadConcept3);
		Thread t4 = new Thread(threadConcept4);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println(Thread.currentThread().getName());
		t4.setPriority(Thread.MAX_PRIORITY);
	}

}

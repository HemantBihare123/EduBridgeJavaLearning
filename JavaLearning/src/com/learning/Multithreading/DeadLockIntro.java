package com.learning.Multithreading;


class Resource{
	public static final String resource1 = "Pen";
	public static final String resource2 = "Paper";
}

class Student1 extends Thread{
	public void run() {
		synchronized(Resource.resource1) {
			System.out.println("Student 1 got pen .. waiting for paper");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class DeadLockIntro {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
	}

}

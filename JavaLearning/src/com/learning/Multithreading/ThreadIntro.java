package com.learning.Multithreading;

//Thread 
//2. Which function of pre defined class Thread is used to check weather current thread being checked is still running?
//A. Join()
//B. Alive()
//C. isAlive()
//D. isRunning()
class Work extends Thread{
	
	public void run() {//Running
		System.out.println(Thread.currentThread().getName()+"is currently in run()");
		//System.out.println("Task executed");
		//Blocking
	}
	
	//Terminate state
	
}
public class ThreadIntro extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work workerThread = new Work(); //New
		Work workerThread2 = new Work(); //New
		Work workerThread3 = new Work(); //New
		
		workerThread.start();  //Runnable--->Thread Schedular
		workerThread.setName("Worker-A");
		
		workerThread2.start(); //Runnable
		workerThread2.setName("Worker-B");
		
		
		
		
	}

}

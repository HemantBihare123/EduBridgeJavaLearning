package com.learning.Multithreading;


class Table{
	public  void printTable(int num){
		for(int i=1; i<=10; i++) {
			System.out.println("Thread name: "+Thread.currentThread().getName()+num+" x "+i+" = "+(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	private Table table;
	private int num;
	MyThread1(Table table, int num){
		this.table = table;
		this.num = num;
	}
	
	public void run() {
		table.printTable(num);
	}
	
	
}
public class ConcurrencyIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		MyThread1 t1 = new MyThread1(table,2);
		MyThread1 t2 = new MyThread1(table,5);
		
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		
		t1.start();
		t2.start();
	}

}

package com.learning.memoryManagement;

class Testing{
	@Override
	public void finalize() {
		System.out.println("Object removed");
	}
}
public class GCIntro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Testing();
		System.gc();
		
	}

}

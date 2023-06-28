package com.learning.memoryManagement;

//1. Nullifying the obj reference
//2. refering to new object
//3. Reassigning the reference
//4. object created inside the method
//5. Anonymous object
class Test{
	
	public void m1() {
		Test t = new Test();
	}
	
	public Test m2() {
		return new Test();
	}
    protected void finalize() throws Throwable{
    	System.out.println("Object removed successfully");
    }
}
public class GCIntro2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Test t1 = new Test();
		t1 = null;
		Test t2 = new Test();
		t2 =new Test();
		Test t3 = new Test();
		Test t4 = new Test();
		t4 =t3;
		
		Test t = new Test();
		t.m1();
		
		Test t5 = new Test();
		Test t6 = t5.m2();
		
		
		System.gc();
		System.out.println("Program terminates");

	}

}

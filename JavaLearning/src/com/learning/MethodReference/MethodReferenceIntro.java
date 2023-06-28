package com.learning.MethodReference;

@FunctionalInterface
interface A{
	void show();
}

class Service{
	public void doSomething(){
		System.out.println("We are learning Method Reference...");
	}
	public void doSomething2(){
		System.out.println("Nothing to do...");
	}
	
}

public class MethodReferenceIntro {

	public static void main(String[] args) {
		Service service = new Service();
		A a = service::doSomething;
		a.show();

	}

}

package com.learning.Encapsulation;


class ATMCard{
	String username ="sbiuser";
	int pin =1234;
	private int password =12345;
	
	public int getpassword() {
		return this.password;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATMCard atm = new ATMCard();
		System.out.println(atm.pin);
		atm.pin = 5678;
		System.out.println(atm.pin);
		System.out.println(atm.getpassword());
//		atm.password=123;

	}

}

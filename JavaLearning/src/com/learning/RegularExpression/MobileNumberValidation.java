package com.learning.RegularExpression;

import java.util.Scanner;

class CheckNumber {

	private String number;

	public CheckNumber(String number) {

		this.number = number;
	}

	public CheckNumber() {

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "CheckNumber [number=" + number + "]";
	}

	public boolean isValid(String number) {
		String regx = "(0||\\+91)?[0-9]{10}";
		if (number.matches(regx)) {
			return true;
		} else {
			return false;
		}

	}

}

public class MobileNumberValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CheckNumber checkNumber = new CheckNumber();
		System.out.println("Enter the mobile number: ");
		String number = sc.nextLine();
		checkNumber.setNumber(number);
		sc.close();
		System.out.println("Vaild number: " + checkNumber.isValid(number));
		System.out.println(checkNumber.getNumber());
	}

}

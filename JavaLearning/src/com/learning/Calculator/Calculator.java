package com.learning.Calculator;

public class Calculator {

	public static long calculate(String a, String b, String c) throws ArithmeticException {
		if(!a.matches("-?\\d+") || !c.matches("-?\\d+")) {
			throw new ArithmeticException("Invalid Input");
		}
		long a1 = Long.parseLong(a);
		long c1 = Long.parseLong(c);
		String regex ="[+\\-*/%]";
		
		if (c1 == 0) {
			throw new ArithmeticException("Error");
		}
		if(!b.matches(regex)) {
			throw new ArithmeticException("Invalid Operation");
		}

		if (b.equals("+")) {
			return a1 + c1;
		} else if (b.equals("-")) {
			return a1 - c1;
		} else if (b.equals("*")) {
			return a1 * c1;
		} else if (b.equals("/")) {
			return a1 / c1;
		} else if (b.equals("%")) {
			return a1 % c1;

		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		String a = "-1234";
		String b = "*";
		String c = "-0.8";
		try {
			System.out.println(Calculator.calculate(a, b, c));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}

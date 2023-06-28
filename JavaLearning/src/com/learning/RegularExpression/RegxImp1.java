package com.learning.RegularExpression;

public class RegxImp1 {

	public static void main(String[] args) {
		String regx = "[a-k][0369][a-zA-Z0-9#$]*";
		String name = "h0";
		System.out.println(name.matches(regx));

	}

}

package com.learning.MethodReference;

@FunctionalInterface
interface StringUtils{
	void getCount(String str);
}

class StringService{
	public void counter(String str) {
		System.out.println(str.length());
	}
}
public class Test {

	public static void main(String[] args) {
		StringService stringService = new StringService();
		StringUtils util = stringService::counter;
		util.getCount("Java");

	}

}

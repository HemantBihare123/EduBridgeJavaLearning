package com.learning.MethodReference;

@FunctionalInterface
interface StringLength{
	int getCount(String str);
}

class StringLengthFinder{
	 int getCount(String str) {
		return str.length();
		
	} 
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengthFinder stringLengthFinder = new StringLengthFinder();
		StringLength a = stringLengthFinder::getCount;
		System.out.println(a.getCount("Hemant"));

	}

}

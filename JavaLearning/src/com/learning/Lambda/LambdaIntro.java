package com.learning.Lambda;

interface A {
	void add(int a, int b);

}

interface B {
	void changeToLowercase(String str);
}

interface C {
	int sumOfElements(int[] arr);
}


interface D{
	int countVowel(String str);
}

public class LambdaIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = (num, num2) -> System.out.println(num + num2);
		a.add(10, 12);
		B b = (str) -> System.out.println(str.toLowerCase());
		b.changeToLowercase("Hello");

		C c = (arr) -> {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			return sum;
		};

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(c.sumOfElements(arr));
		
		D d =(str) -> {
		int count =0;
		str = str.toLowerCase();
		char[] ch =str.toCharArray();
			for(int i=0; i<ch.length; i++) {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					count++;
				}
			}
			return count;
		};
		System.out.println(d.countVowel("HAello"));

	}

}

package com.learning.Operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =5;
		System.out.println("Add" +(a+b));
		System.out.println("Sub" +(a-b));
		System.out.println("Multiply" +(a*b));
		System.out.println("Divide" +(a/b));
		System.out.println("Modules" +(a%b));
		
		//Unary operator: ++ =+1
		
		//pre-increment: ++a post increment=a++
		
		int c =20;
		int d = ++c;
		System.out.println(c+" "+d);
		System.out.println(c+d);
		
		int e = 50;
		int f = e++;
		System.out.println(e+" "+f);
		System.out.println(e+f);
		
		int x =3; // 0 0 1 1 = 1 1 0 0
		System.out.println(~(x));
		
		//Relation operator : boolean: true or false
		//1. greater
		int x1 =5;
		int x2 =10;
		System.out.println(x1<x2);
		
		// Logical operator: boolean
		
		//Bitwise
		int xx2 = 10;
		int yy2 = 5;
	}

}

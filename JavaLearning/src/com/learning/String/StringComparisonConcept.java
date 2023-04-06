/**
 * 
 */
package com.learning.String;

/**
 * @author heman
 *
 */
public class StringComparisonConcept {

	/*
	 *   == and equals method both are meant for reference comparison.
	 *   equals method is the method of the Object class.
	 *   But in string class equal method is overriden for content comparison.
	 *   If string are created using String literal then only one object is creates
	 *   and all will refer to the same object. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hemant");
		String str2 = new String("Hemant");
		boolean str3 = str1 == str2;
		System.out.println("Address of str1: "+'\n'+System.identityHashCode(str1));
		System.out.println("Address of str2: "+'\n'+System.identityHashCode(str2));
//		== operator is used for refernce comparison.
		System.out.println("== operator comparison: "+'\n'+ str3);
//	    Equals Method of Object class which is overriden in String class 
//		and is used for content comparison..
		System.out.println("equals method comparison: "+'\n'+str1.equals(str2));
		System.out.println("--------------------------------------------------------");
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		boolean sb3 = sb1==sb2;
		System.out.println("Address of sb1: "+'\n'+System.identityHashCode(sb1));
		System.out.println("Address of sb2: "+'\n'+System.identityHashCode(sb2));
//		Both == and equals method is used for reference comparison 
//		and here equals method of object class is not overriden.
		System.out.println("== operator comparison: "+'\n'+ sb3);
		System.out.println("equals method comparison: "+'\n'+sb1.equals(sb2));
		System.out.println("--------------------------------------------------------");
		
		String str4 ="Hemant";
		String str5 ="Hemant";
//		Both String object are created using string literals and 
//		both are refering to same address.
		System.out.println("Refernce of both strings created using string literals: "+'\n'+System.identityHashCode(str4)+"\n"+System.identityHashCode(str5));
		System.out.println("== operator comparison: ");
		System.out.println(str4==str5);
		System.out.println("equals method comparison: "+'\n'+str4.equals(str5));
//		equals method is used for content comparison irrespective of 
//		whatever it is created using string literal or by using new keyword.
		System.out.println("equals method comparison str1 and str4: "+'\n'+str4.equals(str1));
		
		String str6 = new String(str4);
		System.out.println(str6==str4);
		String str7 = new String(str1);
		System.out.println(str7==str1);
//		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		
		
	}

}

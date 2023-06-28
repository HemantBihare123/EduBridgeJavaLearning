package com.learning.String;

/*
 *  1. concat()
 *  2. join()
 *  3. subSequence()   // end-1
 *  4. subString()
 */



public class SubstringConcept {

	public static void main(String[] args) {
		String s1 ="Hemant";
		String s2 ="Bihare";
		String s3 ="7000933402";
		String s4 ="hemantbihare@gmail.com this";
		System.out.println(s1 +10+20);
		System.out.println(s1 +(10+20));
		System.out.println(10+20+s1);
		System.out.println(s1+20/10);
		System.out.println(s1+(20-10));
		//System.out.println(s1+20-10);  error
		System.out.println(s1+20*10);
		System.out.println(s1.concat("20+20"));
		System.out.println(s1.concat(s2));
		System.out.println(String.join(",",s1,s2,s3,s4));
		System.out.println(s4.subSequence(1, 13)); //return charSequence
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(3,5));    //String stringSequence
		

	}

}

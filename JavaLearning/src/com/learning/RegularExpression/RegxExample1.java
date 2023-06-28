package com.learning.RegularExpression;

/*
 *  Pattern class split method
 *  for String there is also split method
 */
import java.util.regex.Pattern;

public class RegxExample1 {

	public static void main(String[] args) {
		
		String str = "www.google9.com";
		String regx = "[.]";
		Pattern p = Pattern.compile(regx);
		String[] s   = p.split(str);
		for(String s1 : s) {
			System.out.println(s1);
		}
		
	}

}

package com.learning.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Occurence
 * a 		--- Exactly one
 * + 		--- Atleast One or more number of occurance
 * *		--- 0 or more number of occurance
 * ?		--- Atmost one occurance
 */
public class Quantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abaabcaaab");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
	    
	}

}

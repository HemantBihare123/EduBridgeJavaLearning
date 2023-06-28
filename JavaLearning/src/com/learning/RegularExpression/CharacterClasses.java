package com.learning.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  [abc]  			--- Either 'a' or 'b' or 'c'
 *  [^abc] 			--- Except 'a' or 'b' or 'c'
 *  [a-z]       	--- Any lower case alphabet symbol
 *  [A-Z]       	--- Any upper case alphabet symbol
 *  [a-zA-Z]		--- Any alphabet symbol
 *  [0-9]			--- Any digit from 0 to 9
 *  [a-zA-Z0-9]     --- Any alpha numeric character
 *  [^a-zA-Z0-9]	--- Except alpha numeric character(Special Character)
 */


public class CharacterClasses {

	public static void main(String[] args) {
		String a = "abc";
		String b = "a7b@z#9";
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m =p.matcher(b);
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}

	}

}

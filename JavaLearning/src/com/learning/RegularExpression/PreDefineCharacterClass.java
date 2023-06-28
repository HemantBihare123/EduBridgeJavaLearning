package com.learning.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *    \s      	--- space character
 *    \S 		--- except space character
 *    \d		--- Any digit from 0to 9
 *    \D		--- Except digit any character
 *    \w		--- Any word character[a-zA-Z0-9] i.e(Alpha numeric)
 *    \W		--- except word character i.e (Special Character)
 *    .			--- Any character
 */

public class PreDefineCharacterClass {

	public static void main(String[] args) {
		String a = "Hemant is working for @9 hrs";
		Pattern p = Pattern.compile("\\S");
		Matcher m  = p.matcher(a);
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}

	}

}

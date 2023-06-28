package com.learning.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 
 *        Pattern
 *        Matcher
 *        
 *        Important methods of matcher:-
 *        boolean find()
 *        int start()
 *        int end()               ----- end() + 1 index is return by this method
 *        String group
 *        
 */
public class RegxConcept {

	public static void main(String[] args) {
		String a = "ab";
		String b = "abcdeababcdeab";
		int count =0;
		Pattern p = Pattern.compile(a);
		Matcher m = p.matcher(b);
		while(m.find()) {
			count++;
			System.out.println("Index number: " +m.start()+"..."+(m.end()-1)+"..."+m.group());
		}
		System.out.println("Occurence: "+count);
		
	}

}

package com.learning.Collections.Set;

import java.util.HashSet;
import java.util.Set;

//underline D.S is hashtable
//duplication is not allow
//insertion is not maintained
public class HashSetImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Set<Integer> hashset = new HashSet<>();
	   hashset.add(11);
	   hashset.add(12);
	   hashset.add(13);
	   hashset.add(14);
	   hashset.add(15);
	   hashset.add(16);
	   System.out.println(hashset);
	   hashset.add(11);
	   System.out.println(hashset);
	   hashset.add(null);
	   hashset.add(null);
	   System.out.println(hashset);
	   System.out.println(hashset.size());
	   
	   

	}

}

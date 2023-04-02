package com.learning.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//5.WAP to find the pair of element whose sum is equals to key
public class ElementPairSumEqualKey {
	
	public static void element_pair_sum_equal_key(int key){
		System.out.println("The sum of pairs: ");
		ArrayList ls = new ArrayList();
		HashMap hm = new HashMap(); 
		List l = new LinkedList();
		for(int i=0; i<key; i++) {
			for(int j=i+1; j<key; j++) {
				if(i+j==key) {
					ls.add(i+" "+j);
					hm.put(i, j);
					l.add(i+" "+j);
				
				}
			}
		}
		System.out.println(ls);
		System.out.println(hm);
		System.out.println(l);
		
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int x = sc.nextInt();
		element_pair_sum_equal_key(x);
		
		
	}

}

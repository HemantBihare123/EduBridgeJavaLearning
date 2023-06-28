package com.learning.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(11);
		linkedlist.add(12);
		linkedlist.add(13);
		linkedlist.add(14);
		linkedlist.add(15);
		System.out.println(linkedlist);
		
		
		//add at middle
		linkedlist.add(2, 21);
		System.out.println(linkedlist);
		
		//fetching the value:
		System.out.println(linkedlist.get(2));
		
		
		//add first and last
		linkedlist.addFirst(100);
		linkedlist.addLast(200);
		
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.getLast());
		System.out.println("--------------------");
		
		Iterator itr = linkedlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		linkedlist.add(null);
		linkedlist.add(null);
		System.out.println(linkedlist);
		
		

	}

}

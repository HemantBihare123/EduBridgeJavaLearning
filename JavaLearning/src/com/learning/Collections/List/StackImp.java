package com.learning.Collections.List;

import java.util.Iterator;
import java.util.Stack;

public class StackImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.add("First item");
		stack.push("Second item");
		stack.push("Third item");
		stack.push("Fourth item");
		System.out.println(stack);
		stack.remove("Second item");
		System.out.println(stack);
		stack.pop();
		
		Iterator<String> itr = stack.iterator();
		
	}

}

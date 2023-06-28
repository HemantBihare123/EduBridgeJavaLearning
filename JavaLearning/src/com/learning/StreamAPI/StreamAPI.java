package com.learning.StreamAPI;

/*
	Different Operations On Streams
		Intermediate Operations
1. 	map: The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.

	List number = Arrays.asList(2,3,4,5);
	List square = number.stream().map(x->x*x).collect(Collectors.toList());
2. 	filter: The filter method is used to select elements as per the Predicate passed as an argument.

	List names = Arrays.asList("Reflection","Collection","Stream");
	List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
3. sorted: The sorted method is used to sort the stream.

	
	
	
	Terminal Operations
1. collect: The collect method is used to return the result of the 
			intermediate operations performed on the stream.

	List number = Arrays.asList(2,3,4,5,3);
	Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
2. forEach: The forEach method is used to iterate through every element of the stream.

	List number = Arrays.asList(2,3,4,5);
	number.stream().map(x->x*x).forEach(y->System.out.println(y));
3. reduce: The reduce method is used to reduce the elements of
 	a stream to a single value. The reduce method takes a BinaryOperator as a parameter.

	List number = Arrays.asList(2,3,4,5);
	int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	
 */

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * 
 */
package com.learning.String;

/**
 * @author heman
 *
 */
public class HeapAndScpConcept {

	/*
	 * There are two ways of creating Strings
	 * Using new keyword(like any other object)
	 * or using(like any other primitive datatype) 
	 * In SCP only one object is created of the same content.
	 */
	public static void main(String[] args) {
		
//		Only one object is created in SCP.
		String str1 = "Hemant";

//		Refering to the same object in the SCP.
		String str2 ="Hemant";
//		Total no. of obj creted in str1 and str2 case = 1 object.

//		Two object is created one in heap area and other in SCP.
		String str3 = new String("Ram");
		String str4 = new String("Ram");
//		Total number of object created in str3 and str4 case is 3.
// ---------------------------------------------------------------------------		
		String s = new String("Car");
		System.out.println(System.identityHashCode(s)+" "+s);
		s.concat("Toyota");
		s = s.concat("Model");
		System.out.println(System.identityHashCode(s)+" "+s);
// 		Total 6 object is creates in this case.
//		3 in Heap area and 3 in SCP.
//		IN Heap                   In SCP
//		Car                       Car
//		CarToyota                 Toyota
//		CarModel                  Model

	}

}

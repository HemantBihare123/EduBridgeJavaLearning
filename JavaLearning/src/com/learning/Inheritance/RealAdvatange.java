package com.learning.Inheritance;
//               object class

//  1. String   2. StringBuffer 3. Number  4. Math  Throwable

// Parent class contain most common methods
// Child class contain specific methods

//  Throwable class required for all exception and error

// Without Inheritance
 class HousingLoan{
//	 300 methods
 }
 
 class PersonalLoan{
//	 300 methods
 }
 
 class VechileLoan{
//	 300 Methods
 }
 
// With Inheritance
 
 class Loan{
//	 250 common methods
	 
 }
 
 class HLoan extends Loan{
//	 50 HLoan specific methods we have to right
 }
 
 class PLoan extends Loan{
//	 50 HLoan specific methods we have to right
	 
 }
 
 class VLoan extends Loan{
//	 50 VLoan specific methods we have to right
	 
 }

public class RealAdvatange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

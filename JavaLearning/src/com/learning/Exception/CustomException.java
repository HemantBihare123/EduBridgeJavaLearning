package com.learning.Exception;


//  custom excpetion = checked exception  if we extends Exception class
// custom exception = unchecked 
class NegativeNumberFoundException extends Exception{
	
}

class PostivieNumber{
	public static void setNumber(int num) {
		if(num<0) {
			try {
				throw new NegativeNumberFoundException();
		}catch(NegativeNumberFoundException e) {
			System.out.println(e.getClass()+"\n"+ "Negative number not allowed");
		}
			}else{
			System.out.println(num);
		}
		
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostivieNumber.setNumber(-17);

	}

}

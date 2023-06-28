package com.learning.Exception;

class NotVaildAgeException extends Exception{
	NotVaildAgeException(String message){
		super(message);
	}
}

class Voting{
	public static  String votingAge(int age) throws NotVaildAgeException{
		
		if(age<18) {
			int sub = 18-age;
			
			  throw new NotVaildAgeException("You cannot vote. You can vote after " + sub+" years");
			
			
			}
		
			  return "You are eligible for voting";
		
		
}

public class CustomException2 {

	public static void main(String[] args) {
		try {
		System.out.println(Voting.votingAge(19));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
		
		
	}

}

package com.learning.Exception;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String message) {
		super(message);
	}
}

class MoneyWithdraw{
	static int balance = 5000;
	public static String withdraw(int amount) throws InsufficientFundException{
		
		if(amount>balance) {
		throw new InsufficientFundException("You have Insufficient Fund");
		}
		return "Your balance is: "+(balance - amount);
		
	}
	
	public static String withdrawMoney(int amount) {
		int balance = 10000;
		if(amount > balance) {
			try {
			throw new InsufficientFundException("You have Insufficient Fund");
			}catch(InsufficientFundException e) {
				return e.getMessage();
			}
		}
		return "Your balance is: "+(balance - amount);
	}
}




public class MoneyWithdrawMain {

	public static void main(String[] args) {
		
		try {
		System.out.println(MoneyWithdraw.withdraw(3000));
		}catch(InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(MoneyWithdraw.withdrawMoney(110000));
	}

}

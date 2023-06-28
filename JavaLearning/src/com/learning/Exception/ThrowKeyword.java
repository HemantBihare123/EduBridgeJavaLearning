package com.learning.Exception;


//throw keyword can be use to throw error object explicitly
class Calculation{
	public void doCalculation(int num) {
		if(num<0) {
			try {
				throw new ArithmeticException();
			}catch(ArithmeticException e){
				System.out.println("Unable to calculate sqrt to negative number");
			}
		}else {
			System.out.println(Math.sqrt(num));
		}
	}
}
public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		cal.doCalculation(-1);

	}

}

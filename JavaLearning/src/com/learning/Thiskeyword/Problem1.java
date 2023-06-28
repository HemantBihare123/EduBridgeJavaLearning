package com.learning.Thiskeyword;


class BA{
	int b;
	BA(int b){
		this.b = b;
	}
	
	public void display() {
		int b =20;
		System.out.println(b);
		System.out.println(this.b);
	}
}


public class Problem1 {
	int b;
	Problem1(int b){
		this.b =b;
	}
	void showing() {
	     b =20;
		System.out.println(b);
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BA obj =new BA(10);
			obj.display();
			
			System.out.println("---------");
			Problem1 obj1 =new Problem1(30);
			obj1.showing();
			
	}

}

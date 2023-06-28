package com.learning.Thiskeyword;
//	this keyword is used to refer to the current object.
//	means this keyword is used to refer to the instance variable  
//	of the current class.


//	to avoid confusion to the JVM on instance variable and local 
//	variable we use this keyword.

public class ThisKeyword {
       int i;
       
//       Problem if we don't use this keyword
//       void setvalue(int i) {
//    	   i=i;
//       }
       
       void setvalue(int i) {
    	   this.i=i;
       }

       void getvalue() {
    	   System.out.println(i);
       }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ThisKeyword obj = new ThisKeyword();
         obj.setvalue(10);
         obj.getvalue();
	}

}

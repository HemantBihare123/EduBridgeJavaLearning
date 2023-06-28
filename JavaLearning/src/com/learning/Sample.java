package com.learning;



interface Library {
	   void issueBook(Book b);
	   void retrieveBook(Book b);
	   public class Book {
	      int bookId;
	      String bookName;
	      int issueDate;
	      int returnDate;
	   }
	}


 public class Sample implements Library {
	   public void issueBook(Book b) {
	      System.out.println("Book Issued");
	   }
	   public void retrieveBook(Book b) {
	      System.out.println("Book Retrieved");
	   }
	   public static void main(String args[]) {
	      Sample obj = new Sample();
	      obj.issueBook(new Sample.Book());
	      obj.retrieveBook(new Sample.Book());
	      
	   }
	}

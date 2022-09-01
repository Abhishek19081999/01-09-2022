package com.oops.bll;

public class TestAuthor {
	  public static void main(String[] args) {
	      // Test constructor and toString()
	      Author a1 = new Author();
	      Author a2=new Author("Abhishek","Kumar");
	      Author a3=new Author("Abhishek","Kumar","Programmming in JAVA");
	      
	      System.out.println( "First Name:" + a2.getFirstName());
	      System.out.println( "Last Name:" + a2.getLastName());
	      System.out.println( "Book Name:" + a2.getBookName());
	      System.out.println("A3 : " + a3);
	      System.out.println("First Name : " + a1.getFirstName());
	      System.out.println( "Last Name:" + a1.getLastName());
	      System.out.println( "Book Name:" + a1.getBookName());
	      System.out.println("********************************* ");
	      Author a4=null;
	      System.out.println("A4 : " + a4);
	      a4=a2;
	      System.out.println("A4 : " + a4);
	      
	   }

}

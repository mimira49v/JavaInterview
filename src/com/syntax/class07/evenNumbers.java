package com.syntax.class07;

public class evenNumbers {

	public static void main(String[] args) {
		// Print only even numbers from 1 to 30
				int d=2;
				while(d<=30) {
					System.out.print(d+" ");
					d+=2;
				}
		  System.out.println("Another way to print even numbers from 1 to 30");
		      int e=1;
		      while(e<=30) {
		      	if(e%2==0) {
		      	System.out.print(e+" ");
		      }
		      e++;
		      }
		  System.out.println("End of code!");
	}
}
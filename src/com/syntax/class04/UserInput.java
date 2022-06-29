package com.syntax.class04;
/*
 * to auto import in mac: cmd+shift+0
 * to auto import in win: ctrl+shift+0
 */
import java.util.Scanner;

public class UserInput {
	int num=10;
	int num2=20;
	

	public static void main(String[] args) {
		// importing a scanner and putting inside a box (name)
		Scanner input=new Scanner(System.in);
		//if you want to capture single String ->use next ();
		
		System.out.println("Please enter your name:");
		
		String name=input.next(); //type String and hit enter
		
		System.out.println("Your name is "+name);
		
		// If you want to capture int --> use nextInt();
		System.out.println(name+" please enter your age");
		int age=input.nextInt(); // type int and hit enter
		System.out.println("Your name is "+name+" and your age is"+age);
		//Specify instructions
		
		// 3 we need to capture string value --> use next();
		String country=input.next();
		System.out.println("Please enter country where you from");
		if(country.equals("USA")) {
			System.out.println("You speak english");
		}else if(country.equals("France")) {
		System.out.println("You speak french"); 
		
		}else if  (country.equals("Serbia")) 
			System.out.println("You speak turkish");
		
		 else {
			
			System.out.println("I do not know which language you speak");
		}	

}
}	

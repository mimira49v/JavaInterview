package com.syntax.class05;

import java.util.Scanner;

/*
 * true || true ->true
 * false || true->true
 * true || false->true
 * false || false->false
 * at least one condition needs to be true
 */

public class LogicalOr {

	public static void main(String[] args) {
		
	String day = "Saturday";
	
	
	if (day.equals("Sunday") || day.equals("Saturday")) {
		System.out.println("I have java class");
	}
	System.out.println("Code outside of if statement");
		
	/*
	 * lets ask user what is today day
	 * based on the day lets define which class we have
	 * 
	 * if(monday or friday) --> theres no class today
	 * else if (tuesday or wenesday) --> manual 
	 * else if (thursday) 			 --> review
	 * else if (saturday or sunday)  --> java class
	 * else    (invalid)
	 */
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is the day today");
	String today=scan.next();
	
	if (today.equalsIgnoreCase("monday") || today.equalsIgnoreCase("friday")) {
		System.out.println("There is no class today");
	} else if (today.equalsIgnoreCase("tuesday") || today.equalsIgnoreCase("wednesday")) {
		System.out.println("We have manual class today");
	} else if (today.equalsIgnoreCase("thursday")) {
		System.out.println("We have review class today");
	} else if (today.equalsIgnoreCase("saturday") || today.equalsIgnoreCase("sunday")) {
		System.out.println("Today we have java class");
	
		
		
		
 
	
	
	
	}
}
}

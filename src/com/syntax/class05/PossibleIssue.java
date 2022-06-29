package com.syntax.class05;
// use this for the homeWork
import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		//next() vs nextLine();
		
	Scanner	scan= new Scanner(System.in);
	
		System.out.println("Capturing values using next");
		
		String value = scan.next(); //nextInt(); nextDouble(); nextBoolean(); next().chartAt(0);
		// any time youre above nextLine your code will skip from nextLine
		// theres a process that runs in there whenever we do an input from a keyboard
		
		scan.nextLine(); // this is how you capture and solve the problem.
		
		System.out.println(value);
		
		System.out.println("Capturing values using nextLine");
		
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of program");
	
	}
}

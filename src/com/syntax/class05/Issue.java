package com.syntax.class05;
import java.util.Scanner;
public class Issue {

	public static void main(String[] args) {
	
		// use this for the homeWork
		Scanner	scan= new Scanner(System.in);

				System.out.println("Using next");
				
				 //nextInt(); nextDouble(); nextBoolean(); next().chartAt(0);
				// any time youre above nextLine your code will skip from nextLine
				// theres a process that runs in there whenever we do an input from a keyboard
				
				scan.nextLine(); // this is how you capture and solve the problem. WILL RESOLVE SKIPPING
				
				String value = scan.nextLine();
				System.out.println(value);
				
				System.out.println("Using nextLine");
				String anotherValue=scan.nextLine();
				System.out.println(anotherValue);
				
				System.out.println("End of program");
			
			
	
	// USING next TAKES ONLY ONE WORLD .. nextLine takes the whole sentence // String value = scan.next();
	
	}

		
	}

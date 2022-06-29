package com.syntax.class06;
/*Storing inside the variable code looks cleaner
 * 
 */
import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the scores:");

		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int total = x+y+z;
		
		
		char grade = 0;
		
		if (total>=90) {
			grade='A';
			
		}
		else if (total>=70 && total<90) {
			grade='B';
			
		}
		else if (total>=50 && total<70) {
			grade='C';
			
		}
		else if (total<50) {
			grade='F';
		}
		
	
		System.out.println("Your grade is "+grade);
	// if your grade is A or B --> youre a great student
	// otherwise you should study more
	
	
	if(grade=='A' || grade=='B') {
		System.out.println("You are a great student");
	}
	

}
}

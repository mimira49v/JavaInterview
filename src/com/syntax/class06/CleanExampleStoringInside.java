package com.syntax.class06;
/* Find out the largest number out of the 3 given numbers
 * and then define weather largest number is even or odd
 */
import java.util.Scanner;

public class CleanExampleStoringInside {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
				
			System.out.println("Please enter 3 numbers to find the largest one!");
					
			int num1=1000;
			int num2=2000;
			int num3=3001;
				
			int largest = 0; // here we have an empty box; if this becomes true we are initializing the variable
							// if non of the condition is true we are still initializing the variable
				
			if (num1>num2 && num1>num3) {
					
				largest=num1;
			}else if (num2>num1 && num2>num3) {
					
				largest=num2;
			}else if (num3>num1 && num3>num2) {
					
				largest=num3;
					
			}
				
				System.out.println(largest); // local variable not initialized ERROR 
				
			if(largest%2==0) {
					System.out.println(largest+" is even number");
			}else {
					System.out.println(largest+" is odd number");
			}
				
	}
}

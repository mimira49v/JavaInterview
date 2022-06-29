package HomeWork;
/*
 * You are a loan specialist and 
 * you need to ask user what is the amount of loan is needed. 
 * If loan is less or equal to 200,000 
 * then you would lend the money 
 * otherwise you would reject the client.
 */

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		Scanner loan = new Scanner(System.in);
		System.out.println("What amount of money that youre looking to get?");
		
		int amount = loan.nextInt();
		
		
		if (amount <= 200000l) {
			System.out.println("The bank will be able to lend the money!");
		}else {
			System.out.println("We cant lend the money!");
		}

	}

}
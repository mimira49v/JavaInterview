package HomeWork;
/*
 * Create a Java program that will ask if user has a credit card or not. 
 * If you user does not have a credit card then offer them. 
 * If they do have one ask what is balance on the card? 
 * If balance of the card is larger than 1000, tell them to pay off immediately, 
 * otherwise you can tell them that they can spend more.
 */

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner card = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String cc=card.next();
		
		
		if(cc.equalsIgnoreCase("Yes")) {
			System.out.println("What is the balance?");
			int balance=card.nextInt();
		if (balance>1000) {
			System.out.println("Pay off "+balance+" immediately!!!");
		}else if(balance<=1000) {
			System.out.println("You can spend more!");
		}

	}else {
		System.out.println("Do you wanna sign up?");
	}

}
}
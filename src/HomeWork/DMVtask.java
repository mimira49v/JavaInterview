package HomeWork;

import java.util.Scanner;

/*
 * You are DMV representative and you need to ask customer their age. 
 * If they are 18 and older you will issue a driver license to them, 
 * otherwise you will offer them to get a learners permit.
 */

public class DMVtask {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("How old are you?");
		int issue = age.nextInt();

		if (issue >= 18) {
			System.out.println("We will issue you a driving licence!");
		} else {
			System.out.println("We can offer a learners permit!");

		}
	}

}
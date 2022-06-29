package com.syntax.class04;

import java.util.Scanner;

public class dipl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a diploma? ");

		String diploma = input.nextLine();
		String response = input.next();
		boolean rightAnswere = true;
		if (response.equals(rightAnswere)) {
			
			System.out.println("Congrats, what is your gpa? ");
		}
		System.out.println("Not eligible!!");
		if (response.equals(diploma)) {
			int answer = input.nextInt();

				Scanner wrong = new Scanner(System.in);
				String wrong1 = wrong.next();
				String respose2 = "No";

				if (answer >= 3) {
					System.out.println("You got scholarship!!!");
				}

				else if (answer <= 3) {

					System.out.println("Gotta work it out!");
				}
				}
			}
		}
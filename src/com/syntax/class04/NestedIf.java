package com.syntax.class04;

//***  If inside another if   ****

//  if (boolean condition) { --> Outer if  

//  if outher if is false nothing is executed

//     code a;
//  if (boolean condition) { --> This one is Nested if 
//     code b;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {

			System.out.println("How many doses you have");

			if (dose == 1) {
				System.out.println("You need another shot");
			}

		} else {
			System.out.println("You are fully vaccinated");

		}

		System.out.println("----------------------------");

		boolean allergy = false;

		if (allergy) {
			System.out.println("what allergies you have");
			String allergyType = "gluten";

			if (allergyType.equals("gluten")) {
				System.out.println("Please stay at home when trees are blooming");
			} else if (allergyType.equals("peanut")) {
				System.out.println("Please do not eat food that contains nuts.Take med B");
			} else if (allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet.");
			} else {
				System.out.println("I dont know which suggestion to give you");
			}

		} else { // nested if* * java jumps here when is false!!!!
			System.out.println("You are lucky");
		}

	}

}

/*
 * declare a variable for alergy
 * 
 * if you have alergy --> if you have pollen if you have peanut if you have
 * wheat if no allergy --> you are lucky
 */

// nested if -> always has a dependency on outer if.
// outer if MUST be true in order for nested if to be checked

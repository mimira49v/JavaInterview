package HomeWork;

public class DiplomaTask {

	public static void main(String[] args) {

		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 output should say
		 * “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 */

		boolean diploma = true;
		if (diploma) {
			System.out.println("Congrats");
			double gpa = 3.4;
			if (gpa <= 3.5) {
				System.out.println("You should have studied harder ");

			} else {
				System.out.println("You are eligible for scholarship");
			}
		} else {
			System.out.println("Plese get a degree");
		}
		System.out.println("--------------------");
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 50000 than user will take a loan, o
		 * therwise user will pay cash.
		 */

		double mortgageRate, mortgagePrice;

		mortgageRate = 2.5;
		mortgagePrice = 145000;

		if (mortgageRate > 4.5) {
			System.out.println("I am not going to buy a House right now!");
		} else {
			System.out.println("You can buy a house!");

			if (mortgagePrice > 50000) {
				System.out.println("You should take a loan");
			} else {
				System.out.println("You can pay cash");
			}
		}
	}
}
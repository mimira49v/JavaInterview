package HomeWork;

/*
 * Create a Java program that will ask user to input city and temperature. 
 * Your program should convert Fahrenheit into celsius and print 
 * “The temperature is the city __ is __”
 */
import java.util.Scanner;

/// USING FOR HOMEWORK

public class CityTemperature {

	public static void main(String[] args) {

		Scanner city = new Scanner(System.in);
		System.out.println("Please enter your city? ");
		Scanner temp = new Scanner(System.in);
		String bom = temp.nextLine();
		
		// using next line captures the whole thing
		// if you used next(); it would grab only the first word
		
		{
			System.out.println("Whats your temperature?");
		}
		double fTemp = temp.nextDouble();
		double cTemp;
		cTemp = ((fTemp - 32) * 5) / 9;
		{
			System.out.println("Temperature in celsius is: " + cTemp + "C");
		}

	}
}

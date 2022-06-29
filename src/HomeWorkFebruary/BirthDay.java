package HomeWorkFebruary;

import java.util.Scanner;

public class BirthDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a bith month");
		String month = scan.next();
		
		
		if (month.equals("May") || month.equals("April") || month.equals("March"))
			 {
					System.out.println("Spring");
				}
		else if(month.equals("April") || month.equals("July")||month.equals("August")) {

			System.out.println("Spring");
		}
		else if(month.equals("September") || month.equals("October")||month.equals("November")) {

			System.out.println("Spring");
		}

		else if(month.equals("December") || month.equals("January")||month.equals("February")) {

			System.out.println("Spring");
		
	}
	}
}
			  
			  
package HomeWorkFebruary;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * ask user to enter their country and capture it.Once you capture
		 * print which language user speaks
		 * all the cases must be of the same type
		 * as the variable
		 */
		
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter your country plz: ");
		 String country=input.nextLine();
		 String language;
		 
		 switch (country.toLowerCase()) {
		
		case  "germany":
			language="German";
			break;
		case "usa":
			language="English";
			break;
		case "france":
			language="French";
			break;
		default:
			language="Unknown";
			
		 }
			{
			input.close();
			System.out.println("In "+country+" people speak "+language);
			}
     }


}
package HomeWork;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x = scanner.nextInt();
		int y=scanner.nextInt();
		
		System.out.println("Please use one of the following -; +; *; /;");
		String input=scanner.next();
		int endResult=0;
		
		switch (input) {
		
		
		   case "+":
		       endResult=x+y;
		        	break;
		   case "-":
		       endResult=x-y;
		        	break;     	
		   case "*":
		       endResult=x*y;
		        	break;     	
		   case "/":
		       endResult=x/y;
		        	break;     
		
			default:
				System.out.println("Wrong");
		}
		System.out.println("The result is "+endResult);
		
	}

}

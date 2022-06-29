package com.syntax.class07;

public class doWhileLoop {

	public static void main(String[] args) {
		/*
		 *  do {
		 *  
		 *  code to execut
		 *  
		 *  }while(condition);
		 */
	
			int num=10;
	
			while(num<=3) { 		// is more used than do while
					System.out.println("Hello");
					num++;

				}
			System.out.println("-----------------------------------------------");
			int num1=1;
			
			do { 					// is less used than while
				System.out.println("Hello");
				num1++;
			}while(num1<=3);
	
			System.out.println(" I want to print numbers from 1 to 30 using do while : ");
			int num4=1;
			do { 					// is less used than while
				System.out.print(num4+" ");
				num4++;
			}while(num4<=30);
	
	}

}

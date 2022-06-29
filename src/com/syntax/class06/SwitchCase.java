package com.syntax.class06;
/*
 * Switch case is another conditional statement
 * two types of Conditional Statements in Java:
 * 
 *  1) if statement (we did before)
 *  2) switch statement
 *  
 *  
 *  
 */
public class SwitchCase {

	public static void main(String[] args) {
		   int day=6; // what you declare here thats what youre using in code
		   
		   // default value of all non primitive types is --> null
		   String dayName;
		
		   if(day==1) {
			 dayName="Monday";
		   } else if (day==2) {
			 dayName="Tuesday";
		   } else if (day==3) {
			 dayName="Wednesday";
		   } else if (day==4) {
			 dayName="Thursday";
		   } else if (day==5) {
			 dayName="Friday";
		   } else if (day==6) {
			 dayName="Saturday";
		   } else if (day==7) {
			 dayName="Sunday";
		   }else {
			 dayName="Invalid";
		   }
		   
	/* 
	 * compiler is good cuz of the else block so if none is true 
	 * it will fill the else block without it we have an error
	 * 
	 * swtich case is faster cuz it jumps to default right away if its false....
	 * Else if checks all the lines
	 * break exits of the block of code (switch block)
	 * 
	 * if by mistake you forget a break in this task, java will go to the first true case 
	 * and then to the DEFAULT cuz nothing is stoping Java! thats why we are using BREAK.
	 * 
	 * you cant use string if you declared an intenger variable!!!!!!!!
	 * 
	 * 
	*/ 
	
		   {
			   System.out.println(dayName);
		   }
		   System.out.println("-------------------------------");
		   char choice='l';
		   switch (day) {
		   
		   case 1:
			   dayName="Monday";
			   break;
		   
		   case 2:
			   dayName="Tuesday";
			   break;
		   case 3:
			   dayName="Wednesday";
			   break;
		   case 4:
			   dayName="Thursday";
			   break;
		   case 5:
			   dayName="Friday";
			   break;
		   case 6:
			   dayName="Saturday";
			   break;
		   case 7:
			   dayName="Sunday";
			   break;
		   default:
			dayName="Invalid";
			   break;
	}
		   System.out.println(dayName);
	}
}

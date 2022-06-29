package com.syntax.class10;

public class twodTask {

	public static void main(String[] args) {
		/*Create a 2D array (longer way)where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		 * After storing values print following String:
			Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		
		String[][] names=new String[4][5];
		
		names[0][1]="Smith";
		names[0][2]="Jordan";
		names[0][3]="Jackson";
		names[0][4]="Obama";
		
		names[1][1]="Mr";
		names[1][2]="Mrs";
		names[1][3]="Ms";
		names[1][4]="Miss";
		
		System.out.println(names[1][2]+" "+names[0][1]);
		
		
	
	}

}

package com.syntax.class07;

public class PracticeTask {

	public static void main(String[] args) {
		
		int x=1;
		while(x<=100) {
		
			System.out.print(x+" ");
			x++;
			}
		
		while(x>=1) {
			System.out.print(x+" ");
			x--;
			}
		int y=20;
		while(y<=100) {
			if(y%2==0){
				System.out.println(y+" ");
				y+=2;
				
			}
		}
		x = 100;
		while (x> 0) {
			if (x % 2 == 1) {
				System.out.print(x + " ");
			}
			x--;
		}
		
}
}
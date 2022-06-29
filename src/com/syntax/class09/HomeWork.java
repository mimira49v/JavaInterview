package com.syntax.class09;

public class HomeWork {

	public static void main(String[] args) {
		
	/////////////// Task 1 ////////////////
		
		char[] letter=new char[6];
		letter[0]='A';
		letter[1]='B';
		letter[2]='C';
		letter[3]='D';
		letter[4]='E';		
		letter[5]='F';
		
		System.out.println(letter[1]);
		
		char[] letters= {'A', 'B', 'C','D','E','F'};
		System.out.println(letters[1]);
		
	////////////// Task 2 //////////////////
		
		String[] names=new String[9];
		names[0]="Roman";
		names[1]="Maria";
		names[2]="Jose";
		names[3]="John";
		names[4]="Amanda";
		names[5]="Adam";
		names[6]="Ahmed";
		System.out.println(names[7]);
		
		String[] name= {"Roman", "Maria","Jose","Elmar","Andrew","Amanda","Adam","Ahmed"};
		System.out.println(name[6]);
		
		String[] words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
	}
}


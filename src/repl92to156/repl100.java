package repl92to156;

import java.util.Scanner;

/*
String s;
Write a for loop that will print out the reverse of the string.

Sample input/outputs:

In: manhattan
In: manhattan
nattahnam
nattahnam
In: processor
In: processor
rossecorp
rossecorp
In: racecar
In: racecar
racecar
 */
public class repl100 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());

    }
}

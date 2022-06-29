package repl92to156;

import java.util.Scanner;

/*
Write a for loop that will loop through every character of a word and print out each character, each on a separate line

Sample inputs/outputs:

In: hello
h
e
l
l
o

 */
public class repl102 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (String str : word.split(""))
            System.out.println(str);


    }
}

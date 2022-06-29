package repl92to156;

import java.util.Scanner;

/*
For you to do:

There is a code that takes input as a String.

Write a program that will print out only vowels of that string

Sample input/outputs:

In: howdyho
oo
 */
public class repl105 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                            || word.charAt(i) == 'u') {

                System.out.print("" + word.charAt(i));
            }
        }
    }
}

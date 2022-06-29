package repl92to156;

import java.util.Scanner;

/*
Given the following inputs:

String s;
String s;
Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.

Sample input/outputs:

In: hello
h e l l o
In: hello
h e l l o
In: covert
In: covert
c o v e r t
c o v e r t
In: blasphemy
In: blasphemy
b l a s p h e m y
 */
public class repl103 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        for (String str : s.split(""))
            System.out.print(str+" ");

    }
}

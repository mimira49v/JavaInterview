package repl92to156;

import java.util.Scanner;

/*
For you to do:

Based on the user inputs program should give a correct answer.

If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:

"Proceed with Chrome browser"

If browser is firefox, FIREFOX or FireFOX it should print the:

"Proceed with Firefox browser"

If browser is IE, ie or iE it should print the:

"Proceed with IE browser"

If any other browser it should print the:

"Invalid browser"
 */
public class repl096 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");

        String language = sc.nextLine();
        String Java = "Java";
        String C = "C";
        String C1 = "C++";


        if (language.equalsIgnoreCase("Java")) {
            System.out.println("Java is a programming language");
            } else if (language.equalsIgnoreCase("C")) {
                System.out.println("C is a procedural programming language");
                } else if (language.equalsIgnoreCase("C++")) {
                    System.out.println("C++ is a middle-level programming language");

        } else {
            System.out.println("Doesn't match any programming language");
        }
    }
}



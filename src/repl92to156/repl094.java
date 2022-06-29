package repl92to156;
import java.util.Scanner;
/*
Using Scanner class input string value.

Print out the following: "The first 3 letters of ___ is ___"

For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
 */
public class repl094 {



        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String input=scanner.next();
            System.out.println("The first 3 letters of "+input+" is "+input.substring(0,3));

        }
    }


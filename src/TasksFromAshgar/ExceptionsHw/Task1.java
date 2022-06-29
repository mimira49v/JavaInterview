package TasksFromAshgar.ExceptionsHw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    // How would you handle InputMismatchException
    // Input Mismatch Exception when user enters mismatch value then program expected output.
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter integer value :");
            int value = scan.nextInt();
            System.out.println(value);

        } catch (InputMismatchException in){
            System.out.println("Please enter the correct type of data!");
        }
    }
}

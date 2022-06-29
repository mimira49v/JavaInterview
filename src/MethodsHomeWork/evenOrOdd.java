package MethodsHomeWork;

import java.util.Scanner;

public class evenOrOdd {
// Even or odd
 public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");

        int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }





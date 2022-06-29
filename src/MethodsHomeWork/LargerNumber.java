package MethodsHomeWork;

import java.util.Scanner;

public class LargerNumber {

// Create a method that will take 2 parameters as
// numbers and prints which number is larger.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number :");
        int num2 = scan.nextInt();

        findLargest(num1, num2);

    }

    static void findLargest(int num1, int num2){
        if (num1 >= num2) {
            System.out.println(num1 + " is the biggest number");
                 } else {
                        System.out.println(num2 + " is the biggest number");
        }

    }
}
package com.syntax.class14;

public class Main {
    // Create a method that will take 2 parameters as
    // numbers and prints which number is larger.

    void printLarger(int num1, int num2){
        if(num1>num2) {
            System.out.println("Number 1 is greater");
        }else if (num2>num1){
            System.out.println("Number 2 is greater");
        }else {
            System.out.println("Numbers are same");
        }
    }


public static void main (String[] args){
    Main object=new Main();
    object.printLarger(10,12);
    object.printLarger(12,10);
    object.printLarger(10,10);

}
}


package MethodsHomeWork;

// Write a method to return whether given number is prime or not?

public class primeOrNot {

    String Prime(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return num + " is not a prime number";
                }
            }
        } else {
            return num + " is not a prime number";
        }
        return num + " is prime number";
    }
public static void main(String[] args){

        primeOrNot prime=new primeOrNot();

        System.out.println(prime.Prime(5));
        System.out.println(prime.Prime(8));





}
    }




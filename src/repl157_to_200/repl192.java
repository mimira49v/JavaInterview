package repl157_to_200;

import java.util.LinkedList;

/*
Step 1. Create a method that will identify weather number is prime or not

Step 2. Add all prime numbers into Linked List

Print Linked List:

Expected Output:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
 */
public class repl192 {
        public static void main(String[]args) {
            LinkedList<Integer> primeNumbers = new LinkedList<>();
            for (int i = 1; i <= 100; i++) {
                int counter = 0;
                for (int num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    primeNumbers.add(i);
                }
            }
            System.out.println(primeNumbers);
    }

}

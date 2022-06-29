package repl157_to_200;

import java.util.LinkedList;

/*
Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

Expected Output:

0 1 1 2 3 5 8 13 21 34
 */
public class repl190 {
    public static void main(String[] args) {
        LinkedList <Integer> fibonacci = new LinkedList<>();
        int n1=0;
        int n2=1;
        for (int i = 0; i < 10; i++) {
            fibonacci.add(n1);

            int sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        for (int num:fibonacci
             ) {
            System.out.print(num+" ");
        }

    }

}

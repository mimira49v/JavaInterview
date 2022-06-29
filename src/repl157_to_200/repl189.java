package repl157_to_200;

import java.util.LinkedList;

/*
Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.
Print Linked List
Expected Output
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
 */
public class repl189 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
            System.out.print(list);

        }
    }
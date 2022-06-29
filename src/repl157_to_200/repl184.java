package repl157_to_200;

import java.util.ArrayList;

/*
ArrayList
Create a array list that will hold Integer Objects:

Add below elements to it.

111

222

333

444

555

777

Print first, third and fifth element from your array

Expected Output:

111
333
555
 */
public class repl184 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(777);

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
    }
}

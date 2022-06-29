package repl157_to_200;

import java.util.ArrayList;

/*
ArrayList Remove
Create an Arraylist of type Integer.

Add below elements to it.

111

222

333

444

555

666

Print the ArrayList.

remove all the elements.

Print the Arraylist.

Expected Output:

[111, 222, 333, 444, 555, 666]
[]
 */
public class repl186 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}

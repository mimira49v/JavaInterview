package repl157_to_200;

import java.util.ArrayList;

/*
ArrayList Loop
Create an arrayList of type Integer.

add below values.

111

111

111

999

999

999

Print all the values of List 1 by 1:

Expected Output:

111
111
111
999
999
999
 */
public class repl185 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(999);
        list.add(999);
        list.add(999);
        for (int l:list
             ) {
            System.out.println(l);
        }
    }
}

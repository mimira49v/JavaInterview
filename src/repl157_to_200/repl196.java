package repl157_to_200;

import java.util.HashSet;

/*
Create a Set and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
Expected Output:
[third, first, second]
[]
 */
public class repl196 {
    public static void main(String[] args) {
        HashSet <String> list = new HashSet<>();
        list.add("third");
        list.add("first");
        list.add("second");
        System.out.println(list);
        list.clear();
        System.out.println(list);

    }
}

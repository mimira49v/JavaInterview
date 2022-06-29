package repl157_to_200;

import java.util.Set;
import java.util.TreeSet;

/*
Create Set to store String Objects and you want them to be stored in ascending order

Please add the below values and see the result
"India"
"Australia"
"South Africa"
"India"
"America"
"America"
Print the Set.
Expected Output:
[America, Australia, India, South Africa]
 */
public class repl198 {
    public static void main(String[] args) {
        Set<String> list = new TreeSet<>();
        list.add("India");
        list.add("Australia");
        list.add("South Africa");
        list.add("India");
        list.add("America");
        list.add("America");

        System.out.print(list);
    }
}


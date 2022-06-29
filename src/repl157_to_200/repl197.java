package repl157_to_200;

import java.util.HashSet;

/*
Create a set collection in which you do not want to preserve or sort the order and add below values to it.
Red
Pink
Yellow
White
Black
Print set collection
And get total number of colors available in the set
Expected Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
 */
public class repl197 {
    public static void main(String[] args) {
        HashSet <String> list = new HashSet<>();
        list.add("Red");
        list.add("Pink");
        list.add("Yellow");
        list.add("White");
        list.add("Black");
        list.add("Black");
        System.out.println("Original Hash Set: "+list);
        System.out.println("Size of the Hash Set: "+list.size());

    }
}

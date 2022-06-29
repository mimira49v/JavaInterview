package repl157_to_200;

import java.util.HashSet;

/*
Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
Print elements one by one.
Expected Output
999
111
 */
public class repl195 {
    public static void main(String[] args) {
        HashSet <Integer> list = new HashSet<>();
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(999);
        list.add(999);
        list.add(999);
        for (Integer l:list) {
            System.out.println(l);
        }
    }
}

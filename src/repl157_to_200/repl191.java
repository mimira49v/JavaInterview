package repl157_to_200;

import java.util.ArrayList;
import java.util.Iterator;

/*
(true, false, false)
Create another array list call listB and ad all values from List A into it
Using iterator print all values from ListB 1 by 1
Expected Output:
true
false
false
 */
public class repl191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        ArrayList<Boolean> listB = new ArrayList<>();
        listB.addAll(listA);
        Iterator<Boolean> iterator = listB.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

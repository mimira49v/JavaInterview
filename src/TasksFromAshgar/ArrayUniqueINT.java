package TasksFromAshgar;

import java.util.HashSet;
import java.util.Set;

public class ArrayUniqueINT {

    public static int unique(int [] x) {

        Set<Integer> unique = new HashSet<>();
        Set<Integer> repeat = new HashSet<>();

        for (int e : x) {
            // continuing cuz the number is repeated, and we are looking for the unique number
            if (repeat.contains(e)) {
                continue;
            }
            if (unique.contains(e)) {
                unique.remove(e); // if it contains already remove it from uniques
                repeat.add(e); // and add it to repeated group
            } else {
                unique.add(e);    // else add it to the unique numbers!!!
            }
        }

//      returning unique number in the set
        for (int e : x) {
            if (unique.contains(e)) {
                return e;                 // returning the unique number at this line
            }
        }
        return 0;                         // if there is no unique number returning zero
    }

    public static void main(String[] args) {
        int [] arr = {5,5,1,2,2,3,3,4,4,1,9};
        System.out.println(unique(arr));
    }
}


package repl157_to_200;

import java.util.Iterator;
import java.util.LinkedList;

/*
Create a method that will remove an element based on the specified condition from given List and return new List;

Expected Output:

[USA, Kazakhstan, Pakistan, Russia]
 */
public class repl194 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(countries);
    }
}

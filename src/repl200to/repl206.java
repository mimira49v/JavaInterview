package repl200to;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a Hash Map of String pairs

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using entry set print key and values pairs using loop

Remove below from Map

"ONE"

"FOUR"

Using entry set print key and values pairs using loop

Expected Output:

HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
 */
public class repl206 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> s:map.entrySet()) {
            System.out.println(s.getKey()+" : "+s.getValue());
        }       System.out.println("------------------");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        // REMOVING ONE AND FOUR
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
                if (entry.getKey().equals("ONE") || entry.getKey().equals("FOUR")) {
                    iterator.remove();}}
        // PRINTING VALUES
        System.out.println("HashMap After Remove :");
            for (Map.Entry<String, String> s:map.entrySet()) {
                System.out.println(s.getKey()+" : "+s.getValue());
            }
    }
}


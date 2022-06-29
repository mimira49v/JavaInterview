package repl200to;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create HashMap

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

map.put("mango", 40);

map.put("mango", 40);

Using iterator retrieve all keys and values if the format below:

Expected Output:

Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
 */
public class repl203 {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("mango", 10);
        list.put("apple", 30);
        list.put("orange", 20);
        list.put("mango", 40);
        list.put("mango", 40);

        Iterator<Map.Entry<String, Integer>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
                System.out.println("Key = "+entry.getKey()+" and value ="+entry.getValue());
        }
    }
}



package repl200to;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Create Map in which we want to store keys in Ascending order

Add the below values

1 item = apple

2 item = banana

3 item = pear

4 item = tomato

5 item = mango

6 item: kiwi

Extract all keys and it values and print them in the format below:

Expected Output:

Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
 */
public class repl202 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> list = new LinkedHashMap<>();
        list.put("1 item","Apple");
        list.put("2 item","Banana");
        list.put("3 item","Pear");
        list.put("4 item","Tomato");
        list.put("5 item","Mango");
        list.put("6 item","Kiwi");

        for (Map.Entry<String, String> entry:list.entrySet()) {
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());

        }
    }
}

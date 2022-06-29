package repl200to;
/*
Create a Map that will preserve an order of entry objects

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values using iterator

Expected output:

Patrick ST
265
Vienna
22180
United State
 */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class repl204 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                    System.out.println(entry.getValue());
        }
    }
}


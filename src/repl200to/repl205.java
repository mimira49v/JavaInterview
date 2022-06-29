package repl200to;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/*
Create a HashMap of String.

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all the values in upper case using entrySet

Expected Output:

265
22180
PATRICK ST
UNITED STATE
VIENNA
 */
public class repl205 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                    System.out.println(entry.getValue().toUpperCase(Locale.ROOT));
        }
    }
}
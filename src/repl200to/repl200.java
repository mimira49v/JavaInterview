package repl200to;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/*
Create A Map that will preserve an order of entry objects

Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all values of from the map

Expected Output:

Patrick ST
265
Vienna
22180
United State
 */
public class repl200 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> list = new LinkedHashMap<>();
        list.put("Street","Patrick ST");
        list.put("Suite","265");
        list.put("City","Vienna");
        list.put("Zip","22180");
        list.put("Country","United State");

        for (String s:list.values()
             ) {
            System.out.println(s);
        }
    }
}

package repl200to;

import java.util.HashMap;

/*
Create a Map in which you do not need to preserve the order of the entries

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
Expected Output:
5
0
 */
public class repl201 {
    public static void main(String[] args) {
        HashMap<String,String> list = new HashMap<>();
        list.put("Street","Patrick ST");
        list.put("Suite","265");
        list.put("City","Vienna");
        list.put("Zip","22180");
        list.put("Country","United State");

        System.out.println(list.size());
            list.clear();
                System.out.println(list.size());
    }
}

package com.syntax.class30;

import javax.swing.plaf.ButtonUI;
import java.util.*;

public class Task_1 {

    public static void main(String[] args) {
            /*
Create a map of a building. Store floor number, and it is associated company name.
(Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
        //ADD FIRST IS AVAILABLE IN LINKED LIST CLASS
        //   LinkedList <String> list = new LinkedList<>();
        //   list.addFirst("Anton");
        HashMap<Integer,String > building = new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Apple");
        building.put(3,"Tesla");
        building.put(1,"Amazon");
        building.put(5,"Amazon");
        building.put(4,"Amazon");
        building.put(4,"Syntax");
        building.put(7,"Multiverse");
        System.out.println(building.size());
        // IF THE KEYS ARE DUPLICATED IT WILL OVERRIDE THE LAST ONE
        // THAT'S WHY IT SAYS .SIZE() = 6;
        building.replace(4,"Facebook");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);



    }
}

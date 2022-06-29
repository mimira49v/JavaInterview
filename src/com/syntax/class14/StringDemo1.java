package com.syntax.class14;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringDemo1 {

    public static void main(String[] args) {

        String name="shahima"; // prefered way to use for creating the string!
        String name2=new String("SAHIMA in all uppercase    ");  // .lenght will count the spaces too

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name2.length());
        String newName=name2.toLowerCase();
        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase());

        //name=null;
        System.out.println(name+name2); // you should always prefer this method to perform concatination
        //System.out.println(name.concat(name2)); this is in exception if code is active we want to avoid this
        name="    ";
        System.out.println(name.isEmpty());

    }
}

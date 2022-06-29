package com.syntax.class17;

import com.syntax.class18.AccessModifiers;
import com.syntax.class18.Task2;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        /*
        can't access name because it has private access
        can't access age because it has default access
        can't access weight because it has protected access
        can only access color because it has public access
        which can be accessed from anywhere inside the same
        project
         */

        //System.out.println(am.name);
        //System.out.println(am.age);
        //System.out.println(am.weight);
        System.out.println(am.color);
        String name = "Emily";
        System.out.println(Task2.reverseString(name));

    }
}

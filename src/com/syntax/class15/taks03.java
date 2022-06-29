package com.syntax.class15;
//int index
public class taks03 {
//we get -1 when we are searching for a character that's not present in the string
    public static void main(String[] args) {
        String name="How Camelyou Camelguys Camel ";

        System.out.println(name.indexOf("@"));

        System.out.println(name.indexOf("%"));       // not present that's why -1

        System.out.println(name.indexOf("@",8+1));

        System.out.println(name.indexOf("@",name.indexOf("@")+1));

        System.out.println(name.indexOf("are"));     // takes the first letter of the string!

        System.out.println("name.lastIndexOf(\"@\")"+name.lastIndexOf("@"));

        System.out.println(name.lastIndexOf("are"));

        System.out.println(name.indexOf("Camel", 14));

    }
}

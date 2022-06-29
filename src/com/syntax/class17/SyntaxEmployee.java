package com.syntax.class17;

import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

public class SyntaxEmployee {
    String empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselObject=new SyntaxEmployee();
        aselObject.empID="123";
        aselObject.salary=20000;
        System.out.println(aselObject.empID);
        System.out.println(aselObject.salary);
        //System.out.println(aselObject.CEO);   // Bad practice
        System.out.println(SyntaxEmployee.CEO); // a good practice

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empID="456";
        mozzamObject.salary=198000;
        System.out.println(SyntaxEmployee.CEO);
    }
}

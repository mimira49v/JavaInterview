package com.syntax.class13;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class MethodsDemo3 {

    // int we specify the datatype that method will return
    // squareTheNumber name of the method
    // (int number) parameters of the method
    // return tells java what to return form this method

    int squareTheNumber(int number){
        return number*number;
    }
    int returnTheSameNumber(int number){
        return number;
    }

    public static void main(String[] args){
        MethodsDemo3 obj=new MethodsDemo3();
        int result = obj.squareTheNumber(7);
        System.out.println(result);
        int result2= obj.returnTheSameNumber(7);
        System.out.println(result2);







    }
}

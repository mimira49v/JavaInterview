package com.syntax.class16;


import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        /*
        You have a String a=”Is it saturday? Is it raining?
        Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
         */

        StringBuilder stringBuilder = new StringBuilder("Sunday is great");
        System.out.println(stringBuilder.reverse());

        //ANOTHER WAY
        String s="Sunday";
        StringBuilder str=new StringBuilder(s); // here "s" becomes string builder
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr="";
        String s2=stringBuilder.toString();
        String[] strArr=s2.split(" ");
        System.out.println(Arrays.toString(strArr));

        for (int i=strArr.length-1;i>=0;i--){
            newStr+=strArr[i]+" ";
        }
        System.out.println(newStr);


    }
}
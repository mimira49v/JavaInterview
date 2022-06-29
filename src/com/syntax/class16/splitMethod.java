package com.syntax.class16;

import java.util.Arrays;

public class splitMethod {

    public static void main(String[] args) {
        String s="This is a sentence";
        String[] strArr=s.split(" ");
        System.out.println(Arrays.toString(strArr)); // Java created an array
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[3]);
        String s2="This is a sentence.Batch 12 is great." +
                "Edward is not great.He is super great";
        String[] strArr2=s2.split("[.]");   // tells the array where to split
        System.out.println(strArr2.length);     // prints 4 cuz there is 4 arrays
        System.out.println(strArr2[3].trim()); // returns an array, so He is super great is array number 3!!!!

    }
}

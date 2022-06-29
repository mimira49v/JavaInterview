package com.syntax.class18;

public class task1 {
    /*
    create a method that will accept an array as parameters
    and will return a sum of all elements from that array
    Method should be visible only withing same package and
    accessible by the creating an instance of the class
     */

    int sumArray(int[] array){
        int sum=0;
        for(int num:array
                ){
            sum+=num;
        }
        return sum;
    }

}

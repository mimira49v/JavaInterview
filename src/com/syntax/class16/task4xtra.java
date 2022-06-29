package com.syntax.class16;

public class task4xtra {
    public static void main(String[] args) {
        /*
    get the words from syntax
    reverse the words
    append the words to get the sentence back
    */

        String s = "Sunday is great";
        task4xtra task4 = new task4xtra();

        //task4.reverseString(s);
        //System.out.println(task4.reverseString(s));

        String[] strArray = s.split(" "); // whenever java sees space it will create a new array
        //System.out.println(strArray[2]);
        for (int i = 0; i < strArray.length; i++) {

            System.out.print(task4.reverseString(strArray[i]) + " ");

            //strArray[i]=task4.reverseString(strArray[i]);
        }
    }

    String reverseString(String inputString) {
        // converting String to Stringbuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
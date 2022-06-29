package com.syntax.class14;

public class Main3 {
    /*
    Create a method createEmail(). Based on values of users name, lastName
    and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) ? johnsnow@gmail.com
     */

    String createEmail(String userName, String lastName, String emailType){
        return userName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args){

        Main3 obj=new Main3();
        System.out.println(obj.createEmail("Zul", "fiya", "gmail"));


    }
}

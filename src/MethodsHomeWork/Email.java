package MethodsHomeWork;

import java.util.Scanner;

public class Email {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    //your method should return complete email Address.
    //Example: createEmail(John, Snow, gmail) ? johnsnow@gmail.com or

    String createEmail(boolean email,String userName, String lastName, String emailType) {

        if(email) {
            return(userName+lastName+emailType);
        }else {
            return("Unknown");
        }
    }


    public static void main(String[] args) {

        Email obj=new Email();
        System.out.println(obj.createEmail(true,"milos","mileusnic","@gmail.com"));
    }
}

package com.syntax.reviewclass12;

import com.syntax.util.StringUtility;


public class FacebookTester {

    public static void main(String[] args) {
        Facebook facebook=new Facebook();
        facebook.setName("Milos12321");
        System.out.println(StringUtility.contains("Milos",""));
        facebook.createAccount("Milos",10,"mm123","male","123456");
        facebook.browseFacebook();
    }
}

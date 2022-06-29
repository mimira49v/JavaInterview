package com.syntax.class15;

public class stringPractice {

    public static void main(String[] args) {

        String subject="I love Java and I want to learn more";
        String [] splitedSub = subject.split(" ");

        System.out.println(splitedSub.length);

        for (int i = 0; i< splitedSub.length; i++) {
            System.out.println(splitedSub[i]);
        }
    }
}

package com.syntax.reviewClass11;

public class StaticPolymo {
    void method(int num, String name){
        System.out.println(num+" "+name);
    }
    void method(String name, int num){
        System.out.println(num+" "+name);
    }
}
class Tester1{
    public static void main(String[] args) {
        StaticPolymo s = new StaticPolymo();
        s.method(10,"Yazgul");
    }
}

package com.syntax.reviewClass11;

public class Parent {
    void method(){
        System.out.println("I like mangoes");
    }
    public void method2(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{
    public void method1(){
        System.out.println("I like apples");
    }
}
class Test{
    public static void main(String[] args) {
        Child child = new Child();
        child.method2();
        child.method1();
    }
}
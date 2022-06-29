package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
        child.print();
    }
}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am grandpa");
    }
}
class Parent extends  GrandParent{
    String color="Black";

    void printInfo(){
        System.out.println("I am Parent");
    }
}
class Child extends Parent{
    String color="Red";
    void printInfo(){
        System.out.println("I am Child");
    }
    void print(){
        printInfo();
        super.printInfo();
    }
    void printColor(){
        String color="Green";
        // refers to local variable
        System.out.println(color);
        // refers to instance variable
        System.out.println(this.color);
        // refers to parent variable
        System.out.println(super.color);
    }
}

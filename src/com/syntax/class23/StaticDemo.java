package com.syntax.class23;

public class StaticDemo {

}
class Cat{
    static int noOfLegs=4;
    String name;

Cat(String name){
    this.name=name;
}
    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void print(){
        // we can't access the instance fields directly inside static methods
        // System.out.println(nnoOfLegs);
        // we can't use instance fields with static methods
        // because a static method can only access static variables or static methods !!!!
        System.out.println(noOfLegs);

    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        Cat.print();
        Cat cat2=new Cat("Nella");
        Cat.print();
    }
}
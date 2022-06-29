package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
    public static void main(String[] args) {
     ToStringDemo toStringDemo=new ToStringDemo("Mr.a",10);
        System.out.println(toStringDemo.toString());

    }
}
// INTERVIEW QUESTION
// HERE INHERITANCE IS BY DEFAULT OBJECT IS THE PARENT OF ALL THE CLASSES
// WHY WE NEED TO OVERRIDE TO STRING METHOD INTERVIEW QUESTION
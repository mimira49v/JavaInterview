package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Zuhor";
        System.out.println(student.name);
        student.printName();
        student.studentID="123";
        System.out.println("==============================");
        Principle principle = new Principle();
        principle.name="Gulden";
        principle.printName();
        principle.speacialParkingSlot=false;
    }
}

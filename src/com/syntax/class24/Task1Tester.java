package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
        // in java, we can store the object of a child classes
        // in a parent type variable
        // Every class in java can be treated as data type
        SyntaxStudent syntaxStudent=new SyntaxStudent();
        Student schoolStudent=new SchoolStudent();

        /*int[] arr={1,2,3};
        for (int number:arr
        ) {
            System.out.println(number);
        */

        Student[] students={new SyntaxStudent(),
                    new SchoolStudent(),new CollegeStudent()};

        for (Student student:students) {
            // calling the methods from all the children classes
            student.study();
            student.doHomeWork();
            student.practice();

        }
    }
}

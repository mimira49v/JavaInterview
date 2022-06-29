package com.syntax.class29;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    /*
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the Insertion order.Each student object should
    have name and studentId.Display name of each student
     */
    public static void main(String[] args) {
        // we used hash set cuz retrieval is fast insertion is fast
        // we didn't care about output order
        Set<Student> students = new HashSet<>();
        students.add(new Student("Maha","12"));
        students.add(new Student("Habib","12345"));
        students.add(new Student("Asel","123456789"));

        for (Student s:students) {
            s.printName();
        }
    }
}
class Student{
    String name;
    String studentId;
    Student(String name, String studentId){
        this.name=name;
        this.studentId=studentId;
    }
    void printName(){
        System.out.println(name);
    }
}

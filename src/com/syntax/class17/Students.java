package com.syntax.class17;
/*
Create a Class called Students
Create three variables Name, ID and numberOfStudents
Create three objects of the Students class
Set the value for studentName, studentID and increment the numberOfStudents for each
Print out total number of students
 */
public class Students {
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Yazgul";
        student1.id="123";
        student1.numberOfStudents++;

        Students student2=new Students();
        student2.name="Zuhoor";
        student2.id="456";
        student2.numberOfStudents++;

        Students student3=new Students();
        student3.name="Sayed";
        student3.id="789";
        student3.numberOfStudents++;
        System.out.println(Students.numberOfStudents); // 3

    }
}

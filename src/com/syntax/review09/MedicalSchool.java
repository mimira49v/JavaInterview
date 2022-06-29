package com.syntax.review09;

public class MedicalSchool {

    public static void main(String[] args) {

        // I want to test accessibility

        Doctor doc = new Doctor("Ase","Akhmatova","Dermatologist");
        doc.printInfo(); // public method available
        doc.work();     //  protected method available
        doc.hello();    //  default method available
        // doc.getPaid(); private method is not available in different classes

        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        System.out.println(doc.speciality);
        // System.out.println(doc.salary); private method NOT available in a different class

    }
}

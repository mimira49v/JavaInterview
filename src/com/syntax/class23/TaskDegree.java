package com.syntax.class23;

class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    // nothing here so it goes to the parent class
}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Masters you need Bachelors");
    }
}
public class TaskDegree {
    /*
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
 */

    public static void main(String[] args) {

        Masters masters=new Masters(); // child class override parent class
        masters.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();   // nothing in child class, so it goes to the parent class
    }
}

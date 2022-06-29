package repl92to156;
/*
For you to do

In main class please declared the variables using different access modifiers that will hold value for:

name
city
name of the school
batch number
Create a method to display details in following format:

My name is ___ and I live in ___. I study at ___ in batch ___

Assign values to the variables and execute method display

Expected Output:

My name is John and I live in Miami. I study at Syntax in batch 9
 */
public class repl137 {
    String name;
    String city;
    String nameOfSchool;
    int batchNumber;


    public static void main(String[] args) {
        repl137 main = new repl137();
        main.name="John";
        main.city="Miami";
        main.nameOfSchool="Syntax";
        main.batchNumber=9;
        System.out.println("My name is "+main.name+" and i live in "+main.city+
                "."+"I study at "+main.nameOfSchool+" in batch "+main.batchNumber);

    }
}

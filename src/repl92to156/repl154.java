package repl92to156;
/*
In Parent Class.
Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter of integer type called number.
include the logic to print the value of the number.
In Child class.
Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10". run the application.
Expected Output:
Parent Constructor without argument
Child Constructor without argument
10
 */


class Parent11 {
    Parent11(){
        System.out.println("Parent Constructor without argument");
    }
    Parent11(int num){
        System.out.println(num);
    }
}
class Childx_1 extends Parent11{

    Childx_1(){
        System.out.println("Child Constructor without argument");
    }
    Childx_1(int num){
            super(num);
    }
}
public class repl154 {
    public static void main(String[] args) {
        Childx_1 child1 = new Childx_1();
        Childx_1 child2 = new Childx_1(10);
    }
}

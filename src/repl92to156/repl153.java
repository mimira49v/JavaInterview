package repl92to156;
/*
In parent class
Create a non argument constructor and write a logic to print "This is Parent constructor"
Create a Child Class that will be subclass of the Parent class.
Create a constructor without parameter and call parent class constructor explicitly
In Main Class.
Create and object of Child class and run the application.
Expected Output:
This is Parent constructor
 */


class Parent extends Child{  //this is a class
    Parent(){               // this is a constructor
        System.out.println("This is Parent constructor");
    }
}
class Child {
    Child(){
        System.out.println("This is Parent constructor");
    }
}
        public class repl153 {
            public static void main(String[] args) {
                Child child  = new Child();


            }
    }


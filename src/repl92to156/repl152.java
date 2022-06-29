package repl92to156;

public class repl152 {
    public static void main(String[] args){
        repl152 obj = new repl152();
        obj.cons1("Vienna");
    }
    void cons1(String city){
        System.out.println(city);
    }
    void cons2(){
        System.out.println("Parent Constructor");
    }

    class Child extends repl152 {
        void cons1(String city){
            System.out.println(city);
        }
    }

}
/*
In Parent class.

Create a constructor, it will take a String parameter called city.

include the logic of printing the parameter value.

Create another constructor without parameter.

Include the logic of printing "Parent Constructor".

Create a Child Class that should be a subclass of Parent class

Inside child class create a constructor that will make a call to parameterized constructor of the parent class.

In Main class.

Create an Object of the child class by passing String value "Vienna"

Expected Output:

Vienna
 */
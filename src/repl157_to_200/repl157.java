package repl157_to_200;
/*
Create a Parent class
create instance method m1 saying "m1 method in parent class"
Create a Child class that will be a derived class from Parent
Create same instance method m1 saying "m1 method in child class"
Create another method m2 in child class and inside that method call method m1 from child class and method m1 from parents class
in Main class.
Create and object of child class and call m2 method
Expected Output:
m1 method in child class
m1 method in parent class
 */
class Parent2{
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child2 extends Parent2 {
    void m2(){
        System.out.println("m1 method in child class");
    }
    @Override
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
public class repl157 {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.m2();
        child2.m1();

    }
}

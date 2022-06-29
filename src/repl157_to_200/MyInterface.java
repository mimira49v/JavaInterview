package repl157_to_200;
/*
Create an Interface with name as MyInterface
Create two undefined methods method1 and method2
Inherit the MyInterface to Main Class.
Execute both methods
Expected Output:
implementation of method1
implementation of method1
 */

class repl174 implements MyInterface{
    public static void main(String[] args) {
        MyInterface myInterface = new repl174();
        myInterface.method1();
        myInterface.method2();

    }

    @Override
    public void method1() {System.out.println("implementation of method1");}

    @Override
    public void method2() {System.out.println("implementation of method2");}
}
public interface MyInterface {
    void method1();
    void method2();
}
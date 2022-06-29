package repl157_to_200;
/*
Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
Expected Output:
Child class providing implementation
Parent class providing implementation
 */
class Parent_another{
        void m2(){
        System.out.println("Child class providing implementation");
        }
        void m1(){
        System.out.println("Child class providing implementation");
        }

}
public class repl172 extends Parent_another {
    public static void main(String[] args) {
        repl172 obj = new repl172();
        obj.m2();
        obj.m1();
    }
}

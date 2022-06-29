package repl92to156;
 /*
 Create Three classes (repl149, A, B):
Have a method that prints out the following

For A: "Class A"

For B: "Class B"

Make B extend A

From your Main class create an object of the B class and call the methods.

Output:

Class A
Class B
  */
public class repl149 {
     B b = new B();
   // THIS IS WHERE I STOPPED DIDN'T KNOW HOW TO DECLARE THE OBJECTS INSIDE MAIN CLASS SHOULD GO LIKE THIS:
     // b.classB();
     // b.classA();
}
class A{
    void classA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void classB(){
        System.out.println("Class A");
    }
}

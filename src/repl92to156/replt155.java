package repl92to156;
/*
Create three classes (A, B, C)
Write two constructors:
Have a default constructor that prints out the following
For A: "I"
For B: "am"
For C: "a tester"
Make C extend B
and B extend A
From your Main class create an object of the C class.
Expected Output:
I
am
a tester
 */
class A_1 {
    A_1(){
        System.out.println("I");

    }

}
class B_1 extends A_1 {
    B_1(){
        System.out.println("AM");
    }

}
class C_1 extends B_1 {
    C_1 () {
        System.out.println("a tester");
    }

}
public class replt155 {
    public static void main(String[] args) {
        C_1 obj = new C_1 ();
    }
}

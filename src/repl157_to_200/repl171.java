package repl157_to_200;
/*
Create a Parent Class that will have two overloaded abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
**Expected Output:**
m1 without parameters
m1 method with parameter
 */
abstract class Parent_xyz{
    abstract void m1();
    abstract void m1(String x);
}
public class repl171 extends Parent_xyz {
    public static void main(String[] args) {
        repl171 obj = new repl171();
        obj.m1();
        obj.m1("x");
    }

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String x) {
        System.out.println("m1 method with parameter");
    }
}

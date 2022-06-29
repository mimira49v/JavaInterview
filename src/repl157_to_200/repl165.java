package repl157_to_200;
/*
Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".
Override methods in child class
In Main Class create object of the child class and see which methods are available
Expected Output:
I am a child public method
I am a child protected method
I am a child default method
 */
class ParentX_1{
    public void method1(){
        System.out.println("I am parent public method");
    }
    protected void method2(){
        System.out.println("I am parent protected method");
    }
    void method3(){
        System.out.println("I am parent default method");
    }
    private void method4(){
        System.out.println("I am parent private method");
    }
}
class Child_x_1 extends ParentX_1{

    public void method1(){
        System.out.println("I am child public method");
    }
    protected void method2(){
        System.out.println("I am child protected method");
    }
    void method3(){
        System.out.println("I am child default method");
    }
    private void method4(){
        System.out.println("I am child private method");
    }
}

public class repl165 {
    public static void main(String[] args) {
        Child_x_1 obj = new Child_x_1();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}

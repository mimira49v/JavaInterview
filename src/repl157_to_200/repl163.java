package repl157_to_200;
/*
In Parent Class create a method with name method() that will print "Parent method"
Override method() in Child class that will print "Child method"
In Main Class create objects of child and parent class and call its method.
Expected Output:
Parent method
Child method
 */
class ParentX{
    void method(){
        System.out.println("Parent method");
    }
}
class ChildX extends ParentX{
    @Override
    void method(){
        System.out.println("Child method");
    }
}
public class repl163 {
    public static void main(String[] args) {
        ParentX parentX = new ParentX();
        parentX.method();
        ChildX childX = new ChildX();
        childX.method();
    }


}

package repl92to156;
/*
For you to do:
Create class A
declare variable int i=10;
Create class B extends A
declared variable int i=20;
create a method to display value of variable i from both classes
In Main Class create an object of subclass and call method display
Expected Output:
20
10
 */
class A2{
    int i = 10;

}
class B2 extends A2{
    int i = 20;

    void display () {
        System.out.println (this.i);
        System.out.println (super.i);
    }
}
public class replt156 {
    public static void main(String[] args) {

        B2 obj= new B2();
        obj.display();
    }
}

package repl92to156;
/*
For you to do:

In repl138 declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.

All methods should be accessible by class name

Call methods of Another class inside Main class

Expected Output:

default
protected
public
 */

class AnotherClass{
    private void default1() {
        System.out.println("private");
    }
    void default2(){
        System.out.println("default");
    }
    protected void default3(){
        System.out.println("protected");
    }
    public void default4(){
        System.out.println("public");
    }
}
class Main2 {
    public static void main (String[] args) {
        AnotherClass main = new AnotherClass();
        main.default2();
        main.default3();
        main.default4();


    }
}
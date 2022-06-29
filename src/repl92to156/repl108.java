package repl92to156;
/*
For you to do:

create method and name as m1. Inside your method body add print statement as "m1 method implementation"

create another method and name as m2. Inside your method body add print statement as "m2 method implementation"

Call these two methods in the main method

Expected Output:

m1 method implementation

m2 method implementation

 */
public class repl108 {

    void name(){
        System.out.println("m1 method implementation");
    }
    void name2(){
        System.out.println("m2 method implementation");
    }
    public static void main(String[] args) {
        repl108 m1 = new repl108();
        m1.name();
        repl108 m2 = new repl108();
        m2.name2();
    }
}

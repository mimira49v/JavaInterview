package repl92to156;
/*
For you to do:

1) Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"

2) Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"

3) Call both methods

Expected Output:

newLine method implementation
displayLine method implementation

 */
public class repl110 {

    void line() {
        System.out.println("newLine method implementation");
    }

    void line2() {
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        repl110 newLine = new repl110();
        newLine.line();
        repl110 displayLine = new repl110();
        displayLine.line2();

    }
}

package repl92to156;
/*
For you to do:

Create a String given="Hello Syntax friends".

Using String methods from given String create new String "Welcome Syntax family"

Expected Output:

Welcome Syntax family
 */

public class repl098 {

    public static void main(String[] args) {
        String given = "Hello Syntax friends";

        String newStr = given.replace("Hello", "Welcome");
        String newStr2 = newStr.replace("friends", "family");

        System.out.println(newStr2);
    }
}

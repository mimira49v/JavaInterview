package repl92to156;
/*
For you to do:

Create a String given="I love Java classes at Syntax"
Retrieve 2 Strings using substring method from given String and print them
Expected Output:

classes at Syntax
classes at Syntax
I love Java
 */
public class repl092 {

    public static void main(String[] args) {
        String given="I love Java classes at Syntax";
        System.out.println(given.substring(given.indexOf("c")));
        System.out.println(given.substring(0,given.indexOf("c")));
    }
}



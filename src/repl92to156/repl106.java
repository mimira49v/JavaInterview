package repl92to156;
/*
Instantiate and StringBuffer class

Append Value "Hello" to it

Append value "World" to it.

Print in UPPERCASE.

Expected Output:

HELLO WORLD
 */
public class repl106 {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();

        s.append("Hello");
        s.append(" World");

        String sAppend=s.toString().toUpperCase();
        System.out.println(sAppend);
    }
}

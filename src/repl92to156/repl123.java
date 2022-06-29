package repl92to156;

/*
For you to do:
Declare the instance variables to hold:
integer values String values; double values; boolean values; float values;
Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.
Expected Output:
0
null
0.0
false
0.0
 */
public class repl123 {
    int anInt;
    String aString;
    double aDouble;
    boolean aBoolean;
    float aFloat;

    public static void main(String[] args) {
    repl123 repl123=new repl123();
    repl123.anInt=0;
    repl123.aString=null;
    repl123.aDouble=0.0;
    repl123.aBoolean=false;
    repl123.aFloat=0.0F;
    System.out.println(repl123.anInt);
    System.out.println(repl123.aString);
    System.out.println(repl123.aDouble);
    System.out.println(repl123.aBoolean);
    System.out.println(repl123.aFloat);
    }
}

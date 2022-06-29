package repl92to156;
/*
Declare static variable in class level as below and assign its value:

String ss="Welcome To Syntax Technologies"

Access variable in the main method and print it using three ways you learned so far

Hint:

first way: By calling directly

Second way: By using the className

Third way: By creating the object of the class

Expected Output:

Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies

 */
public class repl124 {
    static String ss="Welcome To Syntax Technologies";
    void aString(){
        System.out.println(ss);
    }
    public static void main(String[] args) {
        System.out.println(ss);
        repl124 repl124 = new repl124();
        repl124.ss="Welcome To Syntax Technologies";
        System.out.println(repl124.ss);
        repl124.aString();
    }
}

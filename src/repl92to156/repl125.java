package repl92to156;
/*
For you to do:

Declare a static variable number that will hold an integer value:

1) Access number from the main method and assign value to it.

2) Create an Object of the class,
access number in a nonstatic way and assigning value of 200.

Print out number using class name and using instance

Expected Output:

200
200
 */
public class repl125 {
    static int number;
    void number(){
        System.out.println(number);
    }
    public static void main(String[] args) {
        repl125 repl125 = new repl125();
        repl125.number = 200;
        System.out.println(number);
        repl125.number();


    }
}
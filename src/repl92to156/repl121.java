package repl92to156;

/*
For you to do:

declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

Expected Output:

10
10.23
a
100
100.23
s
 */
public class repl121 {
    int num;
    double dub;
    char aChar;

    public static void main(String[] args) {
        repl121 repl121=new repl121();
        repl121.num=10;
        repl121.dub=10.23;
        repl121.aChar='a';
        System.out.println(repl121.num);
        System.out.println(repl121.dub);
        System.out.println(repl121.aChar);

        repl121 repl121a=new repl121();
        repl121a.num=100;
        repl121a.dub=100.23;
        repl121a.aChar='s';
        System.out.println(repl121a.num);
        System.out.println(repl121a.dub);
        System.out.println(repl121a.aChar);
    }
}

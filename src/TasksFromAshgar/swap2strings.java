package TasksFromAshgar;

public class swap2strings {
    /*
    Write a program to swap 2 numbers without a temporary variable?
    Swap 2 strings without a temporary variable?
     */

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    a = a+b; //first this should there a= 10+20=30
    b = a-b;
    System.out.println(a);
    System.out.println(b);
    // swap strings
    String x = "Hello";
    String y = "Welcome";
    x = x+y;
    y = x.substring(0,(x).length()-y.length());
    x = x.substring(y.length());
    System.out.println(x);
    System.out.println(y);
    }
}

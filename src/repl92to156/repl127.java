package repl92to156;

/*
For you to do:

Create two methods:

The first method should be a non-static method that will print out the following message:

"Programming is amazing."

The second method should be a static method that will print out the following message:

"Java is awesome."

Execute both methods

Expected Output:

Programming is amazing.
Java is awesome.
 */
public class repl127 {

    static String java(String jav){
        return "Java is awesome.";
    }
    String programming(String prog){
        return "Programming is amazing";
    }

    public static void main(String[] args) {
        String x = repl127.java("Java is awesome.");
        System.out.println(x);
        repl127  repl127 = new repl127();
        String y = repl127.programming("Programming is amazing");
        System.out.println(y);
    }
}

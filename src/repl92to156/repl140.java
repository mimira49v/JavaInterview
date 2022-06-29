package repl92to156;
/*
For you to do:

Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

Expected Output:

this is long
 */
public class repl140 {
    static String maxLength(String[] arr) {
        int max = 0;
        String longestString = null;
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
                longestString = s;
            }
        }
        return longestString;
    }


    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}

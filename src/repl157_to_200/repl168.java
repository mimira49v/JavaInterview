package repl157_to_200;
/*
For you to do:
Create an instance final method that will reverse a String and return that new String
Call method from the main method
Expected Output:
olleh
 */
class Reverse {
    String str = "hello", newStr="";
    char ch;

    public final void reverse () {
        for (int i=0; i<str.length(); i++) {
            ch= str.charAt(i);
            newStr=ch+newStr;
        }
        System.out.println(newStr);
    }
}
public class repl168 extends Reverse{
    public static void main(String[] args) {
        repl168 obj = new repl168();
        obj.reverse();


    }
}
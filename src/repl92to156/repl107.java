package repl92to156;
/*
Given String = "Hello Friends"

Expected Output:

sdneirF olleH

 */
public class repl107 {

    public static void main(String[] args) {


        String Given = "Hello Friends";

        char[] try1 = Given.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);


    }
}
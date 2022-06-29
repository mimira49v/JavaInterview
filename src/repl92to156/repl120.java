package repl92to156;
/*
For you to do:

Declare 3 instance variables to hold:

year, school name and batch #

Access variables from the main method and assign specific values to them

Print values of your variables in the following format:

Expected Output:

I am a student of batch 9 studying at Syntax in the year of 2021
 */
public class repl120 {

    int year;
    String schoolName;
    int batch;


    public static void main(String[] args) {
        repl120 repl120=new repl120();
        repl120.year=2021;
        repl120.schoolName="Syntax";
        repl120.batch=9;

        System.out.println("I am a student of batch "+
                repl120.batch+" studying at "+ repl120.schoolName+
                                    " in the year of "+repl120.schoolName);

    }
}

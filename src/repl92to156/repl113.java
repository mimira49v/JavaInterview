package repl92to156;
/*
For you to do

Step1: Create a method that will accept with 2 parameters of integer type

Step2: Write the logic in that method in println statement to print hours and minutes

Step3: Call the method

Expected Output:

11:30
 */
public class repl113 {

    String clock(int hour,int min) {
        return (hour + ":" + min);
    }

     public static void main(String[] args) {

        repl113 obj = new repl113();

            String result = obj.clock(11,30);
            System.out.println(result);
        }
    }


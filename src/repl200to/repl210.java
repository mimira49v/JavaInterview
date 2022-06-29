package repl200to;

public class repl210 {
//      Complete the code, handle possible exception
//      Expected Output:
///     by zero

        public static void main(String[] args) {

            int a=10,b=0, result;
            try{
                result = a/b;
            } catch (ArithmeticException arithmeticException){
                System.out.println("/ by zero");
            }
        }
    }

package repl92to156;
/*
For you to do :

Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

for the addition method add two numbers to make 30

for multiplication multiply two numbers to make 30

for Subtraction subtract two numbers to equal 20

Expected Output:

Addition 30
Addition 30
Multiplication 30
Multiplication 30
Subtraction 20
 */
public class repl114 {

    int number1=15;
    int number2=15;
    void addNumbers(int number1,int number2) {

        System.out.println("Addition "+(number1+number2));
    }
    void multiply(int number1,int number2) {

        System.out.println("Multiplication "+number1*number2);
    }
    void subtract(int number1,int number2) {

        System.out.println("Subtraction "+(number1-number2));
    }
    public static void main(String[] args) {
        repl114 addition  = new repl114();
        addition .addNumbers(15,15);
        repl114 multip = new repl114();
        multip.multiply(15,2);
        repl114 sub = new repl114();
        sub.subtract(30,10);
    }
}

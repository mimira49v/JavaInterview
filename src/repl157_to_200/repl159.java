package repl157_to_200;
/*
Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers

In main method execute all 3 methods to match the output:

Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)

20 (should come from subtracting 2 numbers)
 */
public class repl159 {
        public static void main(String[] args) {
            substract(10,20,30,40);
            substract(10,10,10);
            substract(10,20);
        }
        static void substract(int num1,int num2,int num3,int num4){
        System.out.println(num1-num2-num3-num4+" (should come from subtracting 4 numbers)");
        }

        static void substract(int num1,int num2,int num3){
            System.out.println(num1-num2-num3+" (should come from subtracting 3 numbers)");
        }

        static void substract(int num1,int num2){
            System.out.println(num1-num2+" (should come from subtracting 4 numbers)");
        }
}


package repl157_to_200;
/*
For you to do:
Overload 2 final instance methods:
Call them in main method
Expected Output:
Final method with boolean parameter
Final method with String parameter
 */
public class repl170 {
    final void x (boolean z){
        System.out.println("Final method with boolean parameter");
    }
    final void x(String str){
        System.out.println("Final method with String parameter");
    }
    public static void main(String[] args) {
        repl170 obj = new repl170();
        obj.x(true);
        obj.x("x");
    }
}

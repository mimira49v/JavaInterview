package repl157_to_200;
/*
Overload private instance method m1

Call each method from the main method.

Expected Output:

private m1 method
private m1 method with int parameter
 */


public class repl161 {
    private void m1(){
        System.out.println("private m1 method");
    }
    private void m2(int x){
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        repl161 obj = new repl161();
        obj.m1();
        obj.m2(10);
    }
}

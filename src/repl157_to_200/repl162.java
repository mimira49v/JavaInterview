package repl157_to_200;
/*
Overload static method and then execute both overloaded methods.

Expected Output:

static method without parameter
static method with int parameter
 */




public class repl162 {
    public static void staticMehtod(){
        System.out.println("static method without parameter");
    }
    public static void staticMehtod2(int x){
        System.out.println("static method with int parameter");
    }
    public static void main(String[] args) {
        repl162 obj = new repl162();
        obj.staticMehtod();
        obj.staticMehtod2(10);
    }
}

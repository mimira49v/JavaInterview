package repl157_to_200;
/*
For you to do:
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method
Expected output:
100
Syntax Technologies
100.09
 */
public class repl160 {

    public int display(int x){
        System.out.println(x);
        return 100;
    }
    public String display(String str){
        System.out.println(str);
        return "Syntax Technologies";
    }
    public double dd(double d){
        System.out.println(d);
        return 100.09;
    }

    public static void main(String[] args) {
        repl160 obj = new repl160();
        obj.display(100);
        obj.display("Syntax Technologies");
        obj.dd(100.09);

    }

}

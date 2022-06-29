package com.syntax.class33;

public class DoSomething {
    void DoSomething(int a, int b) {
        Calculator_001 calculator_001 = new Calculator_001();
        calculator_001.DoTheMath(a,b);
    }

    public static void main(String[] args) {
        DoSomething doSomething = new DoSomething();
        doSomething.DoSomething(10,10);
        // getting 20 and 1 cuz of the math class + and / in math class
    }
}

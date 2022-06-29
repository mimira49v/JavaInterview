package com.syntax.class19;

public class PandaTester {
    public static void main(String[] args) {
        Panda panda = new Panda("Kungfu");
        panda.printInfo();
        Panda panda1=new Panda("TariksPanda",
                "Black Panda");
        panda1.printInfo();
    }
}
// java decides based on arguments you pass what method you wanna use

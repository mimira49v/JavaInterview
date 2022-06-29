package com.syntax.class19;

public class HorseTester {
    public static void main(String[] args) {
        Horse horse = new Horse("Jacky",
                20,400);
        //   Horse -> Data type(names of classes)
        //   horse -> Object/instance/reference variable/variable
        //   =     -> assignment operator.
        //   Horse ("Jacky,20,400) -> call to a constructor
        //   ;  -> line terminator in Java.

        horse.printHorseName();
    }
}

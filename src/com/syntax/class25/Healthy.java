package com.syntax.class25;

public interface Healthy {
    void Healthy();
}
interface Portable{
    void canCarry();
}
interface Eatable{
    void eat();
}

class Orange implements Healthy, Portable, Eatable {
    public void Healthy() {System.out.println("Orange is healthy to eat");}
    public void canCarry() {System.out.println("we can carry orange easily");}
    public void eat() {System.out.println("we can eat orange");}
}
class Laptop implements Portable{
    public void canCarry(){System.out.println("we can carry a laptop easily");}
}
class InterfaceTester {
    public static void main(String[] args) {
        Healthy healthy = new Orange();
    }
}


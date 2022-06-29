package com.syntax.class23;

public class Car {

    void start() {System.out.println("Use keys to start me");}
    void stop()  {System.out.println("Use breaks to stop me");}
    void park()  {System.out.println("Park me manually");}
}
class BMW extends Car{

    void start() {System.out.println("start me with button");}
    void stop()  {System.out.println("Can use breaks or i can autoBreak");}
    void park()  {System.out.println("use parking sensors to park me");}
}
// child class override a method from parent class
class Tesla extends Car{
    void start() {System.out.println("start me with APP");}
    void stop()  {System.out.println("Can use breaks or i can autoBreak");}
    void park()  {System.out.println("use PARKING sensors to park me, AUTO-PARK");}}

class Suzuki extends Car{
    void start() {System.out.println("Push me to start");}
    void stop()  {System.out.println("Lost tires and brake on the way");}
}
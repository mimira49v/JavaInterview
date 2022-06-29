package com.syntax.class25;

public interface MoveAbe {
    void move();
}
interface  driveAble{
    void drive();
}
interface Car extends driveAble,MoveAbe{

}
class BMW implements Car {
    public void move() {System.out.println("we can move the BMW");}
    public void drive() {System.out.println("we can drive the BMW");}
}
class CarTester_1{
    public static void main(String[] args) {
        Car car = new BMW();
        car.drive();
        car.move();
    }
}
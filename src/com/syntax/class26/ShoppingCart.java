package com.syntax.class26;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;

public class ShoppingCart {
    private double originalPrice=100;
    private double discount=.15;

    void setDiscount(double discount){
        if(discount>0 && discount<=.15){
            this.discount=discount;
        }else {
            System.out.println("Can't have that discount");
        }
    }
    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }

public double getDiscount(){
    return discount;
    }
}
class Tester extends ShoppingCart{
    public static void main(String[] args) {
        Tester testerX = new Tester();
        /*  tester.originalPrice=100;
            tester.discount=.20;
         */
        //  tester.setDiscount(.20);
        System.out.println(testerX.getDiscount());
        testerX.calculatePrice();
        //WebDriver webDriver = new ChromeDriver();
        //webDriver.get("www.google.com");
    }
}
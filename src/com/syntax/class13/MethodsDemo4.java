package com.syntax.class13;

public class MethodsDemo4 {

    // create a method that takes a boolean isSaleOn double originalPrice double discount
    // if sale is on i want to give that much discount on that price
    // if no sale same price

    // method signature parametar and method name
    double checkDiscount(boolean isSaleOn, double originalPrice,double discount){
        if(isSaleOn) {
            return (originalPrice-originalPrice*discount);
        }else {
            return originalPrice;
        }
    }

    void methodWithoutParametars(){

    }
    public static void main(String [] args){

        MethodsDemo4 obj=new MethodsDemo4();
        System.out.println(obj.checkDiscount(false, 100, .15));
        System.out.println(obj.checkDiscount(true, 100, .15));

    }
}

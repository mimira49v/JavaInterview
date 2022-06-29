package com.syntax.class29;

import java.math.BigDecimal;

public class FinalDemo {
    public static void main(String[] args) {
        float fl=1/3f;
        if(fl==3.33){
            System.out.println("Equal");
        }else {
            System.out.println("not");
        }
        System.out.println(10/3);

        BigDecimal bigDecimal = new BigDecimal(1.33333333333333333333333);
        float f=1.33333333333333333333333f;
        double f2=1.33333333333333333333333;

        System.out.println(bigDecimal+" big decimal");
        System.out.println(f+" float");
        System.out.println(f2+ " double");
    }
}

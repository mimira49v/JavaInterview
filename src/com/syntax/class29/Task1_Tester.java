package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1_Tester {
    public static void main(String[] args) {
        ArrayList <Insurance> insurances = new ArrayList<>();
        insurances.add(new Car ("AdamsG","Tesla S"));
        insurances.add(new Pet ("CamelInsurance","Horse"));
        insurances.add(new Health ("Keiser","ins"));

        for (Insurance i:insurances
             ) {
            i.getQuote();
            i.cancelInsurance();
            //System.out.println(i);
        }
        Iterator<Insurance> iterator=insurances.iterator();
        while(iterator.hasNext()){
            Insurance i = iterator.next();
            iterator.next().getQuote();
            iterator.next().cancelInsurance();
        }
    }
}

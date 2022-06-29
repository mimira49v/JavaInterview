package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Insurance { 
    /*
Create a class Insurance that will have
an attribute as insuranceName and unimplemented behaviour as
getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has its own
attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the subclasses and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */



    String insuranceName;

    abstract String getQuote();

    abstract String cancelInsurance();

}
class Car extends Insurance {
    String carModel;

    public Car(String carModel){
        this.carModel=carModel;
    }

    @Override
    String getQuote() {
        return "get quote method inside car class";
    }

    @Override
    String cancelInsurance() {
        return "cancel insurance method inside car class";
    }
}

class Pet extends Insurance {  // Task5_HomeWork = Insurance

    String petType;

    public Pet(String petType){

        this.petType=petType;
    }

    @Override
    String getQuote() {
        return "get quote method inside pet class";
    }

    @Override
    String cancelInsurance() {
        return "cancel insurance method inside pet class";
    }
}
class Health extends Insurance {

    @Override
    String getQuote() {
        return null;
    }

    @Override
    String cancelInsurance() {
        return null;
    }
}
class Tester{
    public static void main(String[] args) {

        Car car = new Car("Bmw");
        Pet pet = new Pet("cat");
        Health health = new Health();

        ArrayList <String> subList = new ArrayList<>();
        subList.add(car.getQuote());
        subList.add(car.cancelInsurance());
        subList.add(pet.cancelInsurance());
        subList.add(pet.getQuote());
        subList.add(health.cancelInsurance());
        subList.add(health.getQuote());

        for (int i = 0; i < subList.size(); i++) {
            System.out.println(subList.get(i));
        }

        System.out.println("================================");

        for (String s:subList
             ) {
            System.out.println(s);
        }

        System.out.println("================================");

        Iterator i  = subList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
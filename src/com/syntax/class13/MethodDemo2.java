package com.syntax.class13;

public class MethodDemo2 {

    //create a method that takes an animal name and person name if name is equal to Teyfur and animal
    // is horse print camel otherwise print horse

    void TeyfurAndHorse(String personName,String animalName) {
        if("Teyfur".equals(personName)&& "Horse".equalsIgnoreCase(animalName)){
           System.out.println("This is a camel");
        }else if ("Horse".equalsIgnoreCase(animalName)){
        System.out.println("This is a horse");
        }
    }


public static void main(String[] args){
    MethodDemo2 obj=new MethodDemo2();
    obj.TeyfurAndHorse("Teyfur", "Horse");
    obj.TeyfurAndHorse("Tarik", "Horse");

}
}
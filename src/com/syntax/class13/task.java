package com.syntax.class13;

public class task {

    // create a method that takes a person name and animal name
    // if person name is "Teyfur" and if animal is "Horse" it returns us "camel"


    String personAnimal(String person, String animal) {
        if ("Teyfur".equalsIgnoreCase(person) && animal.equals("Horse")) {
            return "Camel";
        }else if("Horse".equals(animal)) {
            return "Horse";
        }else {
            return "I dont know";
        }
    }

    public static void main(String[] args) {

        task obj = new task();
        String result = obj.personAnimal("Teyfur", "Horse");
        System.out.println(result);
        System.out.println(obj.personAnimal("Tameer", "Horse"));
        System.out.println(obj.personAnimal("Tamer", "Monkey"));
    }
}

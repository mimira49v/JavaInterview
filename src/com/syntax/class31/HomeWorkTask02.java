package com.syntax.class31;

import java.util.LinkedHashSet;

public class HomeWorkTask02 {
    //Create the collection that will store single unique Objects of a String type
    // in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        LinkedHashSet <String> drinks = new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Vodka(Asafafafadf)");
        drinks.add("tequila(Asafafafadf)");
        drinks.add("margarita(Asafafafadf)");
        drinks.add("Link");

        StringBuilder allDrinks = new StringBuilder();
        for (String drink:drinks) {
            allDrinks.append(drink).append(" ");
        }
        System.out.println(allDrinks);
    }
}

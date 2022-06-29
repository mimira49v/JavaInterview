package com.syntax.class21;

public class MethodOverLoading2 {

    void printIntfo(String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }void printIntfo(int age,String name,double weight){
        System.out.println("M2");
        System.out.println(name+" "+age+" "+weight);
    }void printIntfo(int age, double weight,String name){
        System.out.println("M3");
        System.out.println(name+" "+age+" "+weight);
    }void printIntfo(double weight,int age,String name ){
        System.out.println("M4");
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        MethodOverLoading2 methodOverLoadDemo=new MethodOverLoading2();
        methodOverLoadDemo.printIntfo("Zulfiya",16,28);
    }
}

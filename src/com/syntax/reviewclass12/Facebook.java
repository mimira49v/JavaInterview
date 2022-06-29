package com.syntax.reviewclass12;


import com.syntax.util.StringUtility;


public class Facebook {
    private String name;
    private int age;
    private String password;
    private String gender;
    private String phoneNumber;

    void setName(String name) {

        if (name.length() <= 20 && StringUtility.contains(name, "[0-9]")) {
            this.name = name;
                } else {
                    System.out.println("Name should be less than 20 characters" +
                        " and it should not contain numbers");
                }
        }
    void setAge(int age) {
        if (age > 5 && age < 150) {
            this.age = age;
                } else {
                    System.out.println("This age is not allowed");
                }
        }
    void setPassword(String password) {
        if (password.length() >= 8 && !password.contains(name)) {
            this.password = password;
        }
    }
    String getName(String password) {
        if (this.password.equals(password)) {
            return name;
        } else {
            return "";
        }
    }
    public void createAccount(String name, int age, String password, String gender, String phoneNumber) {
        if (name.length() <= 20) {
            this.name = name;
            this.age = age;
            this.password = password;
            this.gender = gender;
            this.phoneNumber = phoneNumber;
        }
        System.out.println("Name :"+" "+this.name);
        System.out.println("Age :"+" "+this.age);
        System.out.println("Password :"+" "+this.password);
        System.out.println("Gender :"+" "+this.gender);
        System.out.println("Phone number :"+" "+this.phoneNumber);
    }
    public void browseFacebook() {
        System.out.println(name + " is Scrolling facebook");
    }
}
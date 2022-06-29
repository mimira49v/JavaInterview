package com.syntax.class18;

public class Facebook {
    private String userName;
    private String password;
    private int age;

    void setAge(int personAge){
        if(personAge>13&& personAge<800){
            age=personAge;
        }else {
            System.out.println(" Not allowed ");
        }
    }
    int getAge(String uuserPassword){
        //protecting the variable age with a password
        if(uuserPassword.equals(password)){
            return age;
        }else {
            return -1;
        }
    }
}

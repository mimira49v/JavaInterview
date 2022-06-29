package com.syntax.class25;

public class BankAccount {
    private double balance=100000;
    private String userName="Habib";
    private String password="Habib123";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void printBalance(String userName, String password){
        if(userName.equals(this.userName)&&password.equals(this.password)){
            System.out.println(balance);
        } else {
            System.out.println("username or password not correct");
        }

    }
}
class BankAccountTester{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.printBalance("Habib","Habib123");

    }
}
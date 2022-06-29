package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account();
        //account.printUserName(); // private access
        /*
        accessing a field directly is different
        from accessing the same field with methods
        having different access modifier
         */
        account.printPassword();
        account.printBalance();
        account.printAcountNumber();
        System.out.println(account.accountNumber);
        account.printPassword();
        account.printBalance();
        account.printAcountNumber();
    }
}

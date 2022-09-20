package com.training.admocs;

public class AccountMain {
    public static void main(String[] args) {
        Account a=new SavingAccount(500, 5);
        System.out.println(a.Interest());
    }
}

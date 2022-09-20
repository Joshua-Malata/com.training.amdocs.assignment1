package com.training.amdcs;

public class permanent {
    public void perm(){
        String name = "Alex";
        int basicPay = 50000;
        double pf = 0.12;
        double interest = 0.15;

        double salary = basicPay - pf;
        double b = salary * interest;

        System.out.println("Permanent Employee: " + name);
        System.out.println("Salary: "+ salary);
        System.out.println("Loan amount: " + b);
    }
}

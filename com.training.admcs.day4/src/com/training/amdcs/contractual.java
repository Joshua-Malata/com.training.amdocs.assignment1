package com.training.amdcs;

public class contractual {
    public void conct(){
        String name = "Jed";
        int basicPay = 30000;
        double pf = 0.12;
        double interest = 0.1;

        double salary = basicPay - pf;
        double b = salary * interest;

        System.out.println("Contractual Employee: " + name);
        System.out.println("Salary: "+ salary);
        System.out.println("Loan amount: " + b);
    }
}

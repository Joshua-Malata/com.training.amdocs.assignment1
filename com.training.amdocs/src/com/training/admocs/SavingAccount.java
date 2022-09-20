package com.training.admocs;


public class SavingAccount extends Account{
    SavingAccount(int p,int t)
    {
        super.setP(p);
        super.setT(t);
    }
    @Override
    public int Interest()
    {
        return (5*super.getP()*super.getT())/100;
    }
}

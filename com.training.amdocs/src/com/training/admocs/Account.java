package com.training.admocs;

public abstract class Account {
    private int p;
    private int t;

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    public abstract int Interest();
}

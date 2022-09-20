package com.training.admocs;

public class AveSum {
    public static void main(String[] args) {
        AveSum obj = new AveSum();
        obj.disp(1, 2, 3);
    }

    public void disp(int a, int b, int c) {
        System.out.println("" + a + " " + b + " " + c);
        System.out.println("Sum: " + (a + b + c));
        System.out.println("Sum: " + (a + b + c) / 3);
    }
}

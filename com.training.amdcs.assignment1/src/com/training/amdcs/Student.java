package com.training.amdcs;

public class Student {
    private String name;
    private int age;
    private int rollNo;

    private int mark;



    public Student(String name, int age, int rollNo, int mark){
        super();
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public void setMark(int mark){
        this.mark = mark;

    }

    public int getMark(){
        if (mark < 30){
            System.out.print("Marks less than 30 cannot be accepted. ");
        }
        return this.mark;
    }
}

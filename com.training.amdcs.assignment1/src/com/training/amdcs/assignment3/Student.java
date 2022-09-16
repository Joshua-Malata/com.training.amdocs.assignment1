package com.training.amdcs.assignment3;

public class Student {
    private String name;
    private int experience;

    public Student(String name, int experience)
    {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString()
    {
        return "{" + "name='" + name + '\'' +
                ", experience=" + experience + '}';
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}

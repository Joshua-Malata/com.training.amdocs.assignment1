package com.training.amdcs;

public class number1 {
    public static void main(String[] args){
        Student student1 = new Student("Akainu",55,101,30);
        Student student2 = new Student("Julia",28,102,29);
        Student student3 = new Student("Larson",25,103,28);
        Student student4 = new Student("Kevin",24,104,35);
        Student student5 = new Student("Dwayne",23,105,31);

        System.out.print(student1.getName() +" ");
        System.out.println(student1.getMark());
        System.out.print(student2.getName()+" ");
        System.out.println("Mark is: "+student2.getMark());

    }
}

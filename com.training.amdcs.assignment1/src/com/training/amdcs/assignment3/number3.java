package com.training.amdcs.assignment3;
import java.util.*;
public class number3 {
    public static void main(String[] args)
    {
        Student[] students = { new Student("Glen", 15), new Student("Lois", 20),
                new Student("Ador", 20), new Student("Joe", 10), new Student("Peter",25)};

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second)
            {
                if (first.getExperience() != second.getExperience()) {
                    return first.getExperience() - second.getExperience();
                }
                return first.getName().compareTo(second.getName());
            }
        });

        System.out.println(Arrays.toString(students));
    }
}

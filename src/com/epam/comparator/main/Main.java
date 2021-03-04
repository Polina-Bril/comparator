package com.epam.comparator.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String...args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(8, "Vasya"));
        students.add(new Student(10, "Sasha"));
        students.add(new Student(3, "Dasha"));
        students.add(new Student(14, "Serge"));
        students.add(new Student(5, "Poli"));
        students.sort(new IdComparator());
        System.out.println(students);
    }
}

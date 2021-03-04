package com.epam.comparator.main;

public class Student extends Person{
    String name;
    Student(int id, String name){
        super(id);
        this.name=name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

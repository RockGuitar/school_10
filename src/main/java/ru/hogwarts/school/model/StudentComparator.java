package ru.hogwarts.school.model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare (Student a, Student b){
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

package com.MvcDemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        students.add(new Student("Thor","Odinson","thor@onion.com"));
        students.add(new Student("Athena","Wise","athena@gmail.com"));
        students.add(new Student("John","Stark","john@stark.com"));
        students.add(new Student("Dante","Alighierii","dnate@hell.com"));
        return students;
    }
}

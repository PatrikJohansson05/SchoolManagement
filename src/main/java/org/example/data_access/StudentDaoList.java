package org.example.data_access;

import java.util.ArrayList;

public class StudentDaoList implements StudentDao {
    private static List<Student> students = new ArrayList<Student>();


    @Override
    public Student saveStudent(Student student) {
        students.add(student)
    }
}

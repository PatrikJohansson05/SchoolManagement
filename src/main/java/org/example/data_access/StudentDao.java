package org.example.data_access;

import org.example.model.Student;

public interface StudentDao {
    Student saveStudent(Student student);
    Student findByEmail(String email);
    List<Student> findByName(String name);
    Student findById(int id);
    List<Student> findAll();
    boolean deleteStudent(Student student);
}

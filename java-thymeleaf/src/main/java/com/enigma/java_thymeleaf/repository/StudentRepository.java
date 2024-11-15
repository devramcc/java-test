package com.enigma.java_thymeleaf.repository;

import com.enigma.java_thymeleaf.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student("S1", "student1", "Dep 1", 35));
        students.add(new Student("S2", "student2", "Dep 1", 70));
        students.add(new Student("S3", "student3", "Dep 1", 60));
        students.add(new Student("S4", "student4", "Dep 1", 90));
        students.add(new Student("S5", "student5", "Dep 2", 30));
        students.add(new Student("S6", "student6", "Dep 3", 32));
        students.add(new Student("S7", "student7", "Dep 3", 70));
        students.add(new Student("S8", "student8", "Dep 3", 20));
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

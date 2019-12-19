package me.cs.boot.service;

import me.cs.boot.po.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteById(String sno);
    Student queryStudentById(String sno);
}

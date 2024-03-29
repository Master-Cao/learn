package me.cs.boot.service;

import me.cs.boot.mapper.StudentMapper;
import me.cs.boot.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteById(String sno) {
        return studentMapper.deleteById(sno);
    }

    @Override
    public Student queryStudentById(String sno) {
        return studentMapper.queryById(sno);
    }
}

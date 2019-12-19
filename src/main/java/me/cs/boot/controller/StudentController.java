package me.cs.boot.controller;

import me.cs.boot.po.Student;
import me.cs.boot.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @RequestMapping(value = "/queryStudent",method = RequestMethod.GET)
    public Student queryStudent(String sno){
        return this.studentService.queryStudentById(sno);
    }
}

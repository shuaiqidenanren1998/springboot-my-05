package com.qf.controller;

import com.qf.pojo.Student;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("findAll")
    public List<Student> findAll () {
        List<Student> all = studentService.findAll();
        return all;
    }

}

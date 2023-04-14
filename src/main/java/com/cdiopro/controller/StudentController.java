package com.cdiopro.controller;

import com.cdiopro.pojo.Student;
import com.cdiopro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();
        System.out.println(studentList);
        return studentList;
    }
}

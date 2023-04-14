package com.cdiopro;

import com.cdiopro.pojo.Student;
import com.cdiopro.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void getAllStudentTest(){
        List<Student> studentList = studentService.getAllStudent();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

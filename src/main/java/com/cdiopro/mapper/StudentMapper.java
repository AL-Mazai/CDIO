package com.cdiopro.mapper;

import com.cdiopro.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    List<Student> getAllStudent();
    Student getStudentById(int id);
}

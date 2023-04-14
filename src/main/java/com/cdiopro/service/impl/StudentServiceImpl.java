package com.cdiopro.service.impl;

import com.cdiopro.mapper.StudentMapper;
import com.cdiopro.pojo.Student;
import com.cdiopro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAllStudent() {
        List<Student> stuentList = studentMapper.getAllStudent();
        return stuentList;
    }
}

package com.cdiopro.mapper;

import com.cdiopro.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getAllTeacher();
    Teacher getTeacherById();
}

package com.zpy.mapper;

import com.zpy.po.Student;

import java.util.List;

public interface StudentMapper1 {

    Student selectOne(Long studentId);

    List<Student> selectList();
}

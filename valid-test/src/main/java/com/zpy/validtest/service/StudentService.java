package com.zpy.validtest.service;

import com.zpy.validtest.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.Set;

@Service
@Validated
public class StudentService {

    @Autowired
    private Validator validator;

    public Student validateStudent(@Valid Student student) {
//        Set<ConstraintViolation<Student>> violations = validator.validate(student);
//        if (!violations.isEmpty()) {
//            throw new ConstraintViolationException(violations);
//        }
        return student;
    }
}

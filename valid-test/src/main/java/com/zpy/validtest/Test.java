package com.zpy.validtest;

import com.zpy.validtest.bean.Student;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.setUserId("aaaa");
        student.setUserName("aaaaa");

        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<Student>> set = validator.validate(student);
        for (ConstraintViolation<Student> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
        }

    }
}

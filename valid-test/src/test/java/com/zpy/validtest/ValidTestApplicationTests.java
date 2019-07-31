package com.zpy.validtest;

import com.zpy.validtest.bean.Student;
import com.zpy.validtest.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolationException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidTestApplicationTests {

    @Autowired
    private StudentService studentService;

    /**
     * 验证service使用valid。
     * 1.service类上加注解validate。
     * 2.要验证的实体前加valid注解。
     */
    @Test
    public void whenInputIsInvalid_thenThrowsException(){

        Student student = new Student();
        Student student1 = studentService.validateStudent(student);
        System.out.println(student1);

    }



}

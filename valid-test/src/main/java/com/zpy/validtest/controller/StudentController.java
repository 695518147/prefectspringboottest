package com.zpy.validtest.controller;

import com.zpy.validtest.bean.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){

        String userId = UUID.randomUUID().toString();
        student.setUserId(userId);
        log.info("成功创建用户信息：{}",student);
        return ResponseEntity.ok(student);
    }
}

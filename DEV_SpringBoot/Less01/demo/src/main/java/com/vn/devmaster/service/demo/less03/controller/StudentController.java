package com.vn.devmaster.service.demo.less03.controller;

import com.vn.devmaster.service.demo.less03.dto.StudentDTO;
import com.vn.devmaster.service.demo.less03.entity.Student;
import com.vn.devmaster.service.demo.less03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    StudentDTO getOneStudent(@RequestParam("id") String id) {
        return studentService.findId();
    }
}

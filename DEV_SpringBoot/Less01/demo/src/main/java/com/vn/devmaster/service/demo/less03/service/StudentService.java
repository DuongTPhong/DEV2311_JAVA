package com.vn.devmaster.service.demo.less03.service;

import com.vn.devmaster.service.demo.less03.entity.Student;
import com.vn.devmaster.service.demo.less03.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student getOne() {
        Student student = studentRepository.getOne();
        return student;
    }

}

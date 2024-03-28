package com.vn.devmaster.service.demo.less03.repository;

import com.vn.devmaster.service.demo.less03.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student getOne() {
        return Student
                .builder()
                .id("1")
                .lastName("Phong")
                .firstName("Duong")
                .clazz("1")
                .build();
    }
}

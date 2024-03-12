package com.vn.devmaster.service.demo.less03.repository;

import com.vn.devmaster.service.demo.less03.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student getOne() {
        return Student
                .builder()
                .name("Phong")
                .address("Ba Vi")
                .build();
    }
}

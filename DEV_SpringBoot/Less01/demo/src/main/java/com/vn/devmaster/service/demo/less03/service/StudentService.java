package com.vn.devmaster.service.demo.less03.service;

import com.vn.devmaster.service.demo.less03.dto.EmployeeDTO;
import com.vn.devmaster.service.demo.less03.dto.StudentDTO;
import com.vn.devmaster.service.demo.less03.entity.Student;
import com.vn.devmaster.service.demo.less03.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO findId() {
        Student student = studentRepository.getOne();
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setClazz(student.getClazz());
        return studentDTO;
    }
}

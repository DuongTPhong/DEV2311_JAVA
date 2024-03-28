package com.vn.devmaster.service.learnjpa.controller;

import com.vn.devmaster.service.learnjpa.dto.StudentDTO;
import com.vn.devmaster.service.learnjpa.entity.Student;
import com.vn.devmaster.service.learnjpa.projection.AvgStudentPoint;
import com.vn.devmaster.service.learnjpa.projection.IStudentPoint;
import com.vn.devmaster.service.learnjpa.repository.StudentRepository;
import com.vn.devmaster.service.learnjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("")
    List<Student> findAll() {
        return studentService.findAll();
    }
    @GetMapping("/find-by-address")
    List<StudentDTO> findByAddress(@RequestParam("address") String address) {
        return studentService.findByAddress(address);
    }
    @PostMapping("/save")
    String saveStudent(@RequestBody StudentDTO student) {
        String message = studentService.saveStudent(student);
        return message;
    }

    @PutMapping("/update")
    String updateStudent(@RequestParam("id") int id, @RequestBody StudentDTO studentDTO) {
        String message = studentService.updateStudent(id, studentDTO);
        return message;
    }

//    @GetMapping("/{id}")
//    List<IStudentPoint> getStudentById(@PathVariable int id) {
//        return studentService.findStudentById(id);
//    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable("id") int id) {
        StudentDTO studentDTO = studentService.findStudentById(id);
        return studentDTO;
    }

    @GetMapping("/avg/{id}")
    List<AvgStudentPoint> getAvgStudent(@PathVariable("id") int id) {
        return studentService.findAvgStudentById(id);
    }
}

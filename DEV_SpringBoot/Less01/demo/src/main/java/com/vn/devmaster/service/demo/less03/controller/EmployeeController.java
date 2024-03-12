package com.vn.devmaster.service.demo.less03.controller;

import com.vn.devmaster.service.demo.less03.dto.EmployeeDTO;
import com.vn.devmaster.service.demo.less03.entity.Employee;
import com.vn.devmaster.service.demo.less03.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/emp")
    Employee getEmp() {
        return employeeService.getEmp();
    }

    @GetMapping("/all{id}")
    Employee findById(@PathVariable("id") String id) {
        return employeeService.findById(id);
    }


    @GetMapping("/dto")
    EmployeeDTO findOne() {
        return employeeService.findOne();
    }
}

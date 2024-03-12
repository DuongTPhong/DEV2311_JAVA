package com.vn.devmaster.service.demo.less03.service;

import com.vn.devmaster.service.demo.less03.dto.EmployeeDTO;
import com.vn.devmaster.service.demo.less03.entity.Employee;
import com.vn.devmaster.service.demo.less03.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;

    public Employee getEmp() {
        Employee employee = employeeRepository.getEmp();
        return employeeRepository.getEmp();
    }

    public Employee findById(String id) {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public EmployeeDTO findOne() {
        Employee employee = employeeRepository.getEmp();
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setAge(employee.getAge());
        return employeeDTO;
    }

}

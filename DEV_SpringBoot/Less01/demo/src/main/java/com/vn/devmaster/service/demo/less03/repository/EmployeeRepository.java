package com.vn.devmaster.service.demo.less03.repository;

import com.vn.devmaster.service.demo.less03.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    public Employee getEmp() {
        return Employee
                .builder()
                .id("1")
                .name("Phong")
                .age(22)
                .address("Ba Vi")
                .salary(5000)
                .build();
    }

    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.builder()
                .id("1")
                .name("Phong")
                .age(22)
                .address("Ba Vi")
                .salary(5000)
                .build());
        employeeList.add(Employee.builder()
                .id("2")
                .name("ABC")
                .age(22)
                .address("Ha Noi")
                .salary(5000)
                .build());
        employeeList.add(Employee.builder()
                .id("3")
                .name("A123")
                .age(22)
                .address("AA")
                .salary(5000)
                .build());
        return employeeList;
    }

    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Employee employee = Employee
                    .builder()
                    .id("1")
                    .name("Phong")
                    .age(22)
                    .address("Ba Vi")
                    .salary(5000)
                    .build();
            employeeList.add(employee);
        }
        return employeeList;
    }
}

package com.vn.devmaster.service.demo.less03.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Employee {
    private String id;
    private String name;
    private Integer age;
    private String address;
    private float salary;

}

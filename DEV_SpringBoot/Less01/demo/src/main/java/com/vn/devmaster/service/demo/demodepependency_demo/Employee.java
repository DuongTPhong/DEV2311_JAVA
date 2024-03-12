package com.vn.devmaster.service.demo.demodepependency_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private Person person;


    public Person getPerson() {
        return person;
    }
}

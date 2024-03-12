package com.vn.devmaster.service.demo.sql;

import org.springframework.stereotype.Component;

@Component
public class MySql implements ISql{
    @Override
    public void connect() {
        System.out.println("My SQL");
    }
}

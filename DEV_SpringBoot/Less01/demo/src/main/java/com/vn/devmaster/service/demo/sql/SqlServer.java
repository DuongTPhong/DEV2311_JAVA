package com.vn.devmaster.service.demo.sql;

public class SqlServer implements ISql{
    @Override
    public void connect() {
        System.out.println("Sql Server");
    }
}

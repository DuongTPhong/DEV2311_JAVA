package com.vn.devmaster.service.demo.baitap;

public class Employee implements Person{
    @Override
    public void wear() {
        System.out.println("Employee wear");
    }

    @Override
    public void work() {
        System.out.println("Employee is working at the company.");
    }
}

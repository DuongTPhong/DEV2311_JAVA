package com.vn.devmaster.service.demo.baitap;

public class Student implements Person{
    @Override
    public void wear() {
        System.out.println("Student wear.");
    }

    @Override
    public void work() {
        System.out.println("Student is studying at the school.");
    }
}

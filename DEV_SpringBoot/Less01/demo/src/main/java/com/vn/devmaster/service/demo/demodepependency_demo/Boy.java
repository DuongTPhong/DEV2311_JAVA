package com.vn.devmaster.service.demo.demodepependency_demo;

import org.springframework.stereotype.Component;


public class Boy implements Person{
    @Override
    public void wear() {
        System.out.println("Boy wear jean");
    }
}

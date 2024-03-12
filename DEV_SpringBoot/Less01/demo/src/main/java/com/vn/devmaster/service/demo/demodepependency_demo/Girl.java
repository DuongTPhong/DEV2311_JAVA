package com.vn.devmaster.service.demo.demodepependency_demo;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Person{
    @Override
    public void wear() {
        System.out.println("Girl wear dress");
    }
}

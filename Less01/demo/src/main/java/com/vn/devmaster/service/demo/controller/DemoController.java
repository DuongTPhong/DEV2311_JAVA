package com.vn.devmaster.service.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("")
    public String demmo() {
        return "Hello";
    }
}

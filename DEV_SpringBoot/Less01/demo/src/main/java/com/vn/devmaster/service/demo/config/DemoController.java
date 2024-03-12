package com.vn.devmaster.service.demo.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("")
    public String demo() {
        return "Hello";
    }
}

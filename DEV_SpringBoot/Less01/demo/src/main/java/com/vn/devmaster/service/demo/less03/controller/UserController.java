package com.vn.devmaster.service.demo.less03.controller;

import com.vn.devmaster.service.demo.less03.dto.UserDTO;
import com.vn.devmaster.service.demo.less03.entity.User;
import com.vn.devmaster.service.demo.less03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/dto")
    UserDTO findOne() {
        return userService.findOne();
    }

    @GetMapping("/all")
    public List<UserDTO> findAll() {
       return userService.findAll();
    }
}

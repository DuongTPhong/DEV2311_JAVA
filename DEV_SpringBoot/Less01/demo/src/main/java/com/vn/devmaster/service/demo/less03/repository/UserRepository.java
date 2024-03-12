package com.vn.devmaster.service.demo.less03.repository;

import com.vn.devmaster.service.demo.less03.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public User findOne() {
        return User
                .builder()
                .id("1")
                .userName("phong")
                .passWord("123")
                .build();
    }
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < 3; i++) {
            User user = User
                    .builder()
                    .id(String.valueOf(count++))
                    .userName("phong")
                    .passWord("123")
                    .build();
            userList.add(user);
        }
        return userList;
    }
}

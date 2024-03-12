package com.vn.devmaster.service.demo.less03.service;

import com.vn.devmaster.service.demo.less03.dto.UserDTO;
import com.vn.devmaster.service.demo.less03.entity.User;
import com.vn.devmaster.service.demo.less03.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public UserDTO findOne() {
        User user = userRepository.findOne();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUserName(user.getUserName());
        return userDTO;
    }

    public List<UserDTO> findAll() {
        List<User> userList = userRepository.findAll();
        return userList.stream().map(user -> {
                    UserDTO userDTO = new UserDTO();
                    userDTO.setId(user.getId());
                    userDTO.setUserName(user.getUserName());
                    return userDTO;
                })
                .collect(Collectors.toList());
    }
}

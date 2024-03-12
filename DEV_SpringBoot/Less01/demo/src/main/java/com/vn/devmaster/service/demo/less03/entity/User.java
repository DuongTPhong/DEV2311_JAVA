package com.vn.devmaster.service.demo.less03.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
    private String id;
    private String userName;
    private String passWord;
}

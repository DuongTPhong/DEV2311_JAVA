package com.vn.devmaster.service.demo.less03.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDTO {
    private String id;
    private String name;
    private String clazz;

}

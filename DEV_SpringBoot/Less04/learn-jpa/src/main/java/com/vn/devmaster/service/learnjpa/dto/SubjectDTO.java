package com.vn.devmaster.service.learnjpa.dto;

import com.vn.devmaster.service.learnjpa.projection.IStudentPoint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SubjectDTO {
    private Integer id;
    private String name;
    private Double point;

}

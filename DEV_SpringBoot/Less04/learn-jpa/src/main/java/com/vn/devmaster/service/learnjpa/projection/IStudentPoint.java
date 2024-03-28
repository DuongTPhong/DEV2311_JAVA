package com.vn.devmaster.service.learnjpa.projection;

import com.vn.devmaster.service.learnjpa.dto.ClazzDTO;

public interface IStudentPoint {
    String getName();
    String getAddress();
    ClazzDTO getClazzName();
    String getSubjectName();
    Double getPoint();
}

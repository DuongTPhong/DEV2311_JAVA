package com.vn.devmaster.service.learnjpa.projection;

import com.vn.devmaster.service.learnjpa.dto.ClazzDTO;

public interface AvgStudentPoint {
    String getName();
    String getAddress();
    ClazzDTO getClazzName();
    Double getPoint();
}

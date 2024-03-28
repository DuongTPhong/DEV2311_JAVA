package com.vn.devmaster.service.learnjpa.mapper;

import com.vn.devmaster.service.learnjpa.dto.SubjectDTO;
import com.vn.devmaster.service.learnjpa.entity.Subject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SubjectMapper implements EntityMapper<Subject, SubjectDTO> {

    @Override
    public Subject toEntity(SubjectDTO dto) {
        return null;
    }

    @Override
    public SubjectDTO toDto(Subject entity) {
        SubjectDTO subjectDTO = new SubjectDTO();
        subjectDTO.setId(subjectDTO.getId());
        subjectDTO.setName(subjectDTO.getName());
        return subjectDTO;
    }

    @Override
    public List<Subject> toEntity(List<SubjectDTO> dto) {
        return null;
    }

    @Override
    public List<SubjectDTO> toDto(List<Subject> entity) {
        List<SubjectDTO> dtos = new ArrayList<>();
        entity.forEach(item -> {
            SubjectDTO subjectDTO = toDto(item);
            dtos.add(subjectDTO);
        });
        return dtos;
    }
}

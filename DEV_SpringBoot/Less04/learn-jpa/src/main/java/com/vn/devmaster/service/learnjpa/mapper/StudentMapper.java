package com.vn.devmaster.service.learnjpa.mapper;

import com.vn.devmaster.service.learnjpa.dto.ClazzDTO;
import com.vn.devmaster.service.learnjpa.dto.StudentDTO;
import com.vn.devmaster.service.learnjpa.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentMapper implements EntityMapper<Student, StudentDTO> {
    private final ClazzMapper clazzMapper;
    private final SubjectMapper subjectMapper;



    @Override
    public Student toEntity(StudentDTO dto) {
        return Student
                .builder()
                .id(dto.getId())
                .address(dto.getAddress())
                .firstName(dto.getName())
                .lastName(dto.getName())
                .clazz(clazzMapper.toEntity(dto.getClazz()))
                .build();
    }

    @Override
    public StudentDTO toDto(Student entity) {
        return StudentDTO
                .builder()
                .id(entity.getId())
                .name(entity.getLastName()+ " " + entity.getFirstName())
                .address(entity.getAddress())
                .clazz(clazzMapper.toDto(entity.getClazz()))
                .subjects(subjectMapper.toDto(entity.getSubjects()))
                .build();
    }

    @Override
    public List<Student> toEntity(List<StudentDTO> dto) {
        return null;
    }

    @Override
    public List<StudentDTO> toDto(List<Student> entity) {
        List<StudentDTO> dtos = new ArrayList<>();
        entity.forEach(student -> {
            StudentDTO studentDTO = toDto(student);
            dtos.add(studentDTO);
        });
        return dtos;
    }
}

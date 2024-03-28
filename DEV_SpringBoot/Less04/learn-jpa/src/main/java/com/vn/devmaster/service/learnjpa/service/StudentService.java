package com.vn.devmaster.service.learnjpa.service;

import com.vn.devmaster.service.learnjpa.dto.StudentDTO;
import com.vn.devmaster.service.learnjpa.dto.SubjectDTO;
import com.vn.devmaster.service.learnjpa.entity.Clazz;
import com.vn.devmaster.service.learnjpa.entity.Student;
import com.vn.devmaster.service.learnjpa.entity.Subject;
import com.vn.devmaster.service.learnjpa.mapper.ClazzMapper;
import com.vn.devmaster.service.learnjpa.mapper.StudentMapper;
import com.vn.devmaster.service.learnjpa.mapper.SubjectMapper;
import com.vn.devmaster.service.learnjpa.projection.AvgStudentPoint;
import com.vn.devmaster.service.learnjpa.projection.IStudentPoint;
import com.vn.devmaster.service.learnjpa.repository.ClazzRepository;
import com.vn.devmaster.service.learnjpa.repository.StudentRepository;
import com.vn.devmaster.service.learnjpa.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final ClazzMapper clazzMapper;
    private final ClazzRepository clazzRepository;
    private final SubjectMapper subjectMapper;
    private final SubjectRepository subjectRepository;
    public List<Student> findAll() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    public List<StudentDTO> findByAddress(String address) {
        List<Student> students = studentRepository.findByAddress(address);
        return studentMapper.toDto(students);
    }

    @Transactional
    public String saveStudent(StudentDTO studentDTO) {
        Clazz clazz = clazzMapper.toEntity(studentDTO.getClazz());
        clazz = clazzRepository.save(clazz);

        Student student = studentMapper.toEntity(studentDTO);
        student.setClazz(clazz);
        studentRepository.save(student);
        return "Thêm thành công";
    }

    public String updateStudent(int id, StudentDTO studentDTO) {
        boolean existsStudent = studentRepository.existsById(id);
        Clazz clazz = clazzRepository
                .findById(studentDTO.getClazz().getId())
                .orElse(new Clazz());
        if (!existsStudent) return "Không có sinh viên có id = " + id;
        if (clazz.getId() == null) return "Không có lớp có id =" + id;
        String[] strings = studentDTO.getName().split(" ");
        if (strings.length < 2) return "Tên không đúng yêu cầu";
        Student student = new Student();
        student.setId(id);
        student.setLastName(strings[0]);
        student.setFirstName(strings[1]);
        student.setAddress(studentDTO.getAddress());
        student.setClazz(clazz);
        studentRepository.save(student);
        return "cập nhật thành công";
    }

//    public List<IStudentPoint> findStudentById(int id) {
//        return studentRepository.findStudentById(id);
//    }


    public StudentDTO findStudentById(int id) {
        List<IStudentPoint> iStudentPoints = studentRepository.findStudentById(id);

        IStudentPoint iStudentPoint = iStudentPoints.get(0);
        StudentDTO dto = new StudentDTO();
        dto.setName(iStudentPoint.getName());
        dto.setAddress(iStudentPoint.getAddress());
        dto.setClazz(iStudentPoint.getClazzName());


        List<SubjectDTO> subjectDTOs = new ArrayList<>();
        iStudentPoints.forEach(item -> {
            SubjectDTO subjectDTO = new SubjectDTO();
            subjectDTO.setName(item.getSubjectName());
            subjectDTO.setPoint(item.getPoint());
            subjectDTOs.add(subjectDTO);
        });

        dto.setSubjects(subjectDTOs);

        return dto;
    }


    public List<AvgStudentPoint> findAvgStudentById(int id) {
        return studentRepository.findAvgStudentById(id);
    }
}

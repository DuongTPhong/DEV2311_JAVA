package com.vn.devmaster.service.learnjpa.repository;

import com.vn.devmaster.service.learnjpa.entity.Clazz;
import com.vn.devmaster.service.learnjpa.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}

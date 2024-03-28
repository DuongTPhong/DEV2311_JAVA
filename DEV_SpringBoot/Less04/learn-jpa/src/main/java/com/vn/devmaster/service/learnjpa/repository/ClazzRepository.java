package com.vn.devmaster.service.learnjpa.repository;

import com.vn.devmaster.service.learnjpa.entity.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz, Integer> {
}

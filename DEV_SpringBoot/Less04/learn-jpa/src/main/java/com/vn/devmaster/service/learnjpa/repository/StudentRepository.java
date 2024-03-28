package com.vn.devmaster.service.learnjpa.repository;

import com.vn.devmaster.service.learnjpa.entity.Student;
import com.vn.devmaster.service.learnjpa.projection.AvgStudentPoint;
import com.vn.devmaster.service.learnjpa.projection.IStudentPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student where address like concat('%', :address, '%')", nativeQuery = true)
    List<Student> findByAddress(@Param("address") String address);

    @Query(value = "SELECT concat(s.last_name, ' ', s.first_name) AS name," +
            " s.address AS address," +
            " c.name AS nameClazz,\n" +
            " sb.name AS nameSubject," +
            " ss.point AS point " +
            " FROM student s\n" +
            "LEFT JOIN clazz c ON s.clazz_id = c.id\n" +
            "LEFT JOIN student_subject ss ON s.id = ss.id_student\n" +
            "LEFT JOIN subject sb ON ss.id_subject = sb.id WHERE s.id = :id \n",nativeQuery = true)
    List<IStudentPoint> findStudentById (@Param("id")int id);


    @Query(value = "SELECT concat(s.last_name, ' ', s.first_name) AS name,\n" +
            "       s.address AS address,\n" +
            "       c.name AS nameClazz,\n" +
            "       AVG(ss.point) AS avgPoint\n" +
            "FROM student s\n" +
            "         LEFT JOIN clazz c ON s.clazz_id = c.id\n" +
            "         LEFT JOIN student_subject ss ON s.id = ss.id_student\n" +
            "         LEFT JOIN subject sb ON ss.id_subject = sb.id \n" +
            "WHERE s.id = :id ", nativeQuery = true)
    List<AvgStudentPoint> findAvgStudentById(@Param("id")int id);

}

package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entities.Student;
@Repository
public interface StudentDao<INT> extends JpaRepository<Student, INT> {

}

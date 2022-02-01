package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Student;

public interface StudentDao<INT> extends JpaRepository<Student, INT> {

}

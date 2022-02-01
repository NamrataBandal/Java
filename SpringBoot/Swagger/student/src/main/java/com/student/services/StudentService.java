package com.student.services;

import java.util.List;

import com.student.entities.Student;

public interface StudentService {

	public List<Student> getStudent();
	public Student addStudent(Student student);
	public Object getStudent(int studentId);
	public void deleteStudent(int studentId);
	//public Student updateStudent(int studentId);
	public void updateStudent(Student studentId);
	
}

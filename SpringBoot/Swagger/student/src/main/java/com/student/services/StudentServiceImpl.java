package com.student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.entities.Student;
@Service
public class StudentServiceImpl implements StudentService {
	List<Student>list;
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student>getStudent(){
		return studentDao.findAll();
	}
	
	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Optional<Student> getStudent(int studentId) {
		
		return studentDao.findById(studentId);
	}

	@Override
	public void deleteStudent(int studentId) {
	   studentDao.deleteById(studentId);
	}

	@Override
	public void updateStudent(Student studentId) {
		studentDao.save(studentId);
		
	}

	/*
	 * @Override public Student updateStudent(int studentId) {
	 * 
	 * return (Student) studentDao.save(studentId); }
	 */
	

}

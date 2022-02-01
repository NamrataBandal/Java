package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Student;
import com.student.services.StudentService;

@RestController
@RequestMapping("/api/v1/")
public class Mycontroller {
	
	@Autowired
	private StudentService studentService;
	//get the student list
	@GetMapping("student/")
	public List<Student> getStudent(){
		return this.studentService.getStudent();
		
	}
	//add the student or create new student
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	//get single student show
	@GetMapping("/student/{studentId}")
	public Object getStudent(@PathVariable int studentId) {
		return studentService.getStudent(studentId);
	}
	
	//update student using put request
	
	  @PutMapping("/student/{studentId}")
	  public ResponseEntity<HttpStatus> updateStudent(@RequestBody Student studentId) {
			try {
				this.studentService.updateStudent(studentId);
				return new ResponseEntity<>(HttpStatus.OK);
						
			}
			catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	  }
	 	
	//delete the student 
	@DeleteMapping("/student/{studentId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int studentId) {
		try {
			this.studentService.deleteStudent(studentId);
			return new ResponseEntity<>(HttpStatus.OK);
					
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}

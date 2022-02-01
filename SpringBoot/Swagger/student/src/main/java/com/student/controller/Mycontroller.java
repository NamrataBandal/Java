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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Student;
import com.student.services.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/api/v1/")
@Api(value = "/api/v1/", tags = "Student Management")
public class Mycontroller {
	
	@Autowired
	private StudentService studentService;
	//get the student list
	@GetMapping("student/")
	@ApiOperation(value = "Get Student", notes = "Get Student Details", tags = { "Student Management" }, response = Iterable.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully Display All Student List"),
			@ApiResponse(code = 404, message = "Invalid data"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@RequestMapping(value="student/",method = RequestMethod.GET,produces = "application/json")
	public List<Student> getStudent(){
		return this.studentService.getStudent();
		
	}
	//add the student or create new student
	@PostMapping("/student")
	@ApiOperation(value = "Post Student", notes = "Post Student Details", tags = { "Student Management" }, response = Iterable.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully Add Student"),
			@ApiResponse(code = 404, message = "Invalid data"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@RequestMapping(value="student/",method = RequestMethod.POST,produces = "application/json")
	
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	//get single student show
	@GetMapping("/student/{studentId}")
	@ApiOperation(value = "Get Student", notes = "Get Single Student Details", tags = { "Student Management" }, response = Iterable.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully Display single Student"),
			@ApiResponse(code = 404, message = "Invalid data"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@RequestMapping(value="student/{studentId}",method = RequestMethod.GET,produces = "application/json")
	
	public Object getStudent(@PathVariable int studentId) {
		return studentService.getStudent(studentId);
	}
	
	//update student using put request
	
	  @PutMapping("/student/{studentId}")
	  @ApiOperation(value = "Put Student", notes = "Update Student Details", tags = { "Student Management" }, response = Iterable.class)
		@ApiResponses(value = { 
				@ApiResponse(code = 200, message = "Successfully Update Student"),
				@ApiResponse(code = 404, message = "Invalid data"),
				@ApiResponse(code = 500, message = "Internal server error") })
		@RequestMapping(value="student/{studentId}",method = RequestMethod.PUT,produces = "application/json")
		
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
	@ApiOperation(value = "delete Student", notes = "Delete Student Details", tags = { "Student Management" }, response = Iterable.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully Delete Student"),
			@ApiResponse(code = 404, message = "Invalid data"),
			@ApiResponse(code = 500, message = "Internal server error") })
	@RequestMapping(value="student/{studentId}",method = RequestMethod.DELETE,produces = "application/json")
	
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

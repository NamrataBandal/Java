package com.student.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "The database generated student ID")
	private int id;
	@ApiModelProperty(notes = "The database generated student name")
	private String name;
	@ApiModelProperty(notes = "The database generated student contact number")
	private String contactno;
	@ApiModelProperty(notes = "The database generated course")
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contactno=" + contactno + ", course=" + course + "]";
	}
	public Student(int id, String name, String contactno, String course) {
		super();
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

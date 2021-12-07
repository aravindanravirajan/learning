package com.example.demo.Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name="student")
public class Student {
	@Id
	private Integer studentId;
	private String name;
	private Date dateOfBirth;
	//@ManyToMany(targetEntity = Student.class, mappedBy = "course", cascade = CascadeType.ALL)
	//@JsonBackReference
	@ManyToMany(targetEntity = Student.class, mappedBy = "course", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Course> course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String name, Date dateOfBirth, List<Course> course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", course="
				+ course + ", getStudentId()=" + getStudentId() + ", getCourse()=" + getCourse() + ", getName()="
				+ getName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

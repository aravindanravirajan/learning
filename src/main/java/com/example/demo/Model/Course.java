package com.example.demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "course")
public class Course {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	private String id;
	private String courseName;
	private Integer studentId;
	@ManyToMany(targetEntity = Student.class, mappedBy = "course", cascade = CascadeType.ALL)
	@JsonBackReference
	
	private List<Student> studentTable;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String id, String courseName, Integer studentId, List<Student> studentTable) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.studentId = studentId;
		this.studentTable = studentTable;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", studentId=" + studentId + ", studentTable="
				+ studentTable + ", getId()=" + getId() + ", getCourseName()=" + getCourseName() + ", getStudentId()="
				+ getStudentId() + ", getStudentTable()=" + getStudentTable() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public List<Student> getStudentTable() {
		return studentTable;
	}
	public void setStudentTable(List<Student> studentTable) {
		this.studentTable = studentTable;
	}
}
package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Course;

import com.example.demo.Model.Student;

import com.example.demo.Repository.Courserepository;
import com.example.demo.Repository.StudentRepository;

@Service
public class Serveice {
     @Autowired
	StudentRepository studentrepository;
     @Autowired 
     Courserepository courserepository;
	
	public List<Student> getting() {
		return studentrepository.findAll();
	}

	public List<Course> courses() {
		
		return courserepository.findAll();
	}
	public List<Course> setting(List<Course> coursedetails) {
		courserepository.saveAll(coursedetails);
		return courserepository.findAll();
	}

	public List<Student> setdetails(List<Student> studenttable) {
		studentrepository.saveAll(studenttable);
	
		return studentrepository.findAll();
	}
	}
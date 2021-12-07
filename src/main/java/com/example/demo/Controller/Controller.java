package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Course;
import com.example.demo.Model.Student;
import com.example.demo.Service.Serveice;

@RestController
@RequestMapping("/user")
public class Controller {
	@Autowired
	Serveice service;
	
	@GetMapping("/get")
	public String get() {
		return "Aravindan";
	}
	@GetMapping("/getting")
	public List<Student> getts() {
		return service.getting();
	}
	@GetMapping("/course")
	public List<Course> course() {
		return service.courses();
	}
	@PostMapping("/set")
		public List<Course> set(@RequestBody List<Course> coursedetails) {
			return service.setting(coursedetails);
	}
    @PostMapping("/setdetails")
    public List<Student> sets(@RequestBody List<Student> studenttable){
    	return service.setdetails(studenttable);
    }
		}

package com.vk.schoolservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.schoolservice.model.Student;
import com.vk.schoolservice.services.StudentService;

@RestController
@RequestMapping("/students") //basically we are telling to spring boot to go to student controller if request contains students in it 
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
		
	}
	
	@GetMapping("/institutes/{instituteId}")
	public List<Student> getStudentsById(@PathVariable("instituteId") Integer instituteId) {
		return studentService.getStudentById(instituteId);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
		
	}

}

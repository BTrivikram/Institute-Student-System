package com.vk.instituteservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.instituteservice.models.Institute;
import com.vk.instituteservice.models.Student;
import com.vk.instituteservice.services.InstituteService;

@RequestMapping("/institutes")
@RestController
public class InstituteController {
	
	@Autowired
	InstituteService instituteService;
	
	@PostMapping
	public Institute createInstitute(@RequestBody Institute institute) {
		  System.out.println("Received: " + institute);
		return instituteService.createInstitute(institute);
		
	}
	
	@GetMapping
	public List<Institute> getAllInstitues(){
		return instituteService.getAllInstitutes(); 
	}
	
	@GetMapping("/students/{instituteId}")
	public List<Student> getStudentsByInstituteId(@PathVariable Long instituteId) throws Exception{
		return instituteService.getStudentsByInstituteId(instituteId);
	}

}

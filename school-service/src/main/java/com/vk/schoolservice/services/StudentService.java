package com.vk.schoolservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.schoolservice.model.Student;
import com.vk.schoolservice.repositories.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student createStudent(Student student){
	Student savedStudent=studentRepository.save(student);//this will save the student data and return that data with id 
		return savedStudent;
	}

	public List<Student> getStudentById(Integer instituteId) {
		return studentRepository.findAllByInstituteId(instituteId);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}
}

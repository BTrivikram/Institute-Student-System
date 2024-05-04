package com.vk.instituteservice.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vk.instituteservice.models.Institute;
import com.vk.instituteservice.models.Student;
import com.vk.instituteservice.repositories.InstituteRepository;

@Service
public class InstituteService {

	@Autowired
	InstituteRepository instituteRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Institute createInstitute(Institute institute) {
		Institute savedInstitute=instituteRepository.save(institute);
		System.out.println("Received: " + savedInstitute);
		return savedInstitute;
	}
	
	public List<Institute> getAllInstitutes() {
	List<Institute>	instituteList=instituteRepository.findAll();
	return instituteList;
		
	}

	public List<Student> getStudentsByInstituteId(Long instituteId) throws Exception{
	Optional<Institute>	optionalInstitute =instituteRepository.findById(instituteId);
	
	if(optionalInstitute.isEmpty()) {
		throw new Exception("Institutes with given id not found");
	}
	else {
	Student[] students=restTemplate.getForObject("http://localhost:8080/students/institutes/"+instituteId, Student[].class);
		return List.of(students);
	}
	}

}

package com.vk.schoolservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vk.schoolservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
List<Student> findAllByInstituteId(Integer instituteId);



}

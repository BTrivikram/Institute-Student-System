package com.vk.instituteservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vk.instituteservice.models.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Long>{

}

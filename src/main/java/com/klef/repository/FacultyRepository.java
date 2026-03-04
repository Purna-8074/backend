package com.klef.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
	
	Faculty findByEmailAndPassword(String email, String password);
	

}

package com.klef.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.model.Faculty;
import com.klef.repository.FacultyRepository;


@Service
public class FacultyServiceImplementation  implements FacultyService{

	 
	 @Autowired private FacultyRepository facultyRepository;
	
	@Override
	public Faculty checkFacultyLogin(Faculty f) {
		 return facultyRepository.findByEmailAndPassword(f.getEmail(), f.getPassword());
	}
	
	

	  
}

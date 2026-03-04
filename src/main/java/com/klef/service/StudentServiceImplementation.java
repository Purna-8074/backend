package com.klef.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.model.Student;
import com.klef.repository.StudentRepository;


@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired private StudentRepository studentRepository;
	
	@Override
	public Student checkStudentLogin(Student s) {
		 return studentRepository.findByEmailAndPassword(s.getEmail(), s.getPassword());
	}
	
}

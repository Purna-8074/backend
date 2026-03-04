package com.klef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.model.Admin;
import com.klef.model.Faculty;
import com.klef.model.Student;
import com.klef.repository.AdminRepository;
import com.klef.repository.FacultyRepository;
import com.klef.repository.StudentRepository;

@Service
public class AdminServiceImplements implements AdminService{

	@Autowired private AdminRepository adminRepository;
	@Autowired private StudentRepository studentRepository;
	@Autowired private FacultyRepository facultyRepository;
	
	
	@Override
	public Admin checkAdminLogin(Admin a) {
		 return adminRepository.findByUsernameAndPassword(a.getUsername(),a.getPassword());
	
	}


	@Override
	public String addStudent(Student s) {
		 studentRepository.save(s);
		 return "Student Added Succesfully";
	}


	@Override
	public List<Student> viewAllStudents() {
		 return studentRepository.findAll();
	}


	@Override
	public String addFaculty(Faculty s) {
		 facultyRepository.save(s);
		 return "Faculty Added Succesfully";
		
	}


	@Override
	public List<Faculty> viewAllFaculty() {
		 return facultyRepository.findAll();
	}

}

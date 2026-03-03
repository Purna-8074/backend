package com.klef.service;

import java.util.List;

import com.klef.model.Admin;
import com.klef.model.Student;

public interface AdminService {
	
 	public Admin checkAdminLogin(Admin a);
	public String addStudent(Student s);
	public List<Student> viewAllStudents();
	


}

package com.klef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.model.Admin;
import com.klef.model.Faculty;
import com.klef.model.Student;
import com.klef.service.AdminService;

@RestController
@RequestMapping("adminapi")
@CrossOrigin("*") // * means any URL
public class AdminController 
{
	@Autowired
	private AdminService adminService;

	@PostMapping("/login")
	public ResponseEntity<?> checkadminlogin(@RequestBody Admin a) 
	{
		try
		{
			Admin admin = adminService.checkAdminLogin(a);
			if (admin != null) 
			{
				return ResponseEntity.status(200).body(admin);
			}
			else 
			{
				return ResponseEntity.status(401).body("Admin Login Failed");
			}
		}
		catch(Exception e)
		{
			return ResponseEntity.status(500).body(e.getMessage());
		}

	}

	@PostMapping("/addstudent")
	public ResponseEntity<String> addStudent(@RequestBody Student s)
	{
		try
		{
			String msg = adminService.addStudent(s);

			return ResponseEntity.status(201).body(msg);
		} 
		catch (Exception e)
		{
			return ResponseEntity.status(500).body(e.getMessage());
		}
	}
	
	
	@GetMapping("/viewallstudents")
	public ResponseEntity<?>   viewallstudents()
	{
		List<Student> students = adminService.viewAllStudents();
		if (students.size()>0) {
			return ResponseEntity.status(200).body(students);
		}
		else 
		{
			return ResponseEntity.status(404).body("Student Data Not Found");
		}
	
	}
	
	
	@PostMapping("/addfaculty")
	public ResponseEntity<String> addFaculty(@RequestBody Faculty f)
	{
		try
		{
			String msg = adminService.addFaculty(f);

			return ResponseEntity.status(201).body(msg);
		} 
		catch (Exception e)
		{
			return ResponseEntity.status(500).body(e.getMessage());
		}
	}
	
	@GetMapping("/viewallfaculty")
	public ResponseEntity<?>   viewallfaculty()
	{
		System.out.println("hello");
		List<Faculty> faculty = adminService.viewAllFaculty();
		if (faculty.size()>0) 
		{
			return ResponseEntity.status(200).body(faculty);
		}
		else 
		{
			return ResponseEntity.status(204).body("Faculty Data Not Found");
		}
	
	}
	
	
	
	
}
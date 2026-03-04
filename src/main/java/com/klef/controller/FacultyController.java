package com.klef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.model.Faculty;
import com.klef.service.FacultyService;

@RestController
@RequestMapping("facultyapi")
public class FacultyController 
{

	@Autowired
	private FacultyService facultyService;

	@PostMapping("/login")
	public ResponseEntity<?> checkfacultylogin(@RequestBody Faculty f) 
	{
		try
		{
			Faculty faculty = facultyService.checkFacultyLogin(f);
			if (faculty != null) 
			{
				return ResponseEntity.status(200).body(faculty);
			}
			else 
			{
				return ResponseEntity.status(401).body("Faculty Login Failed");
			}
		}
		catch(Exception e)
		{
			return ResponseEntity.status(500).body(e.getMessage());
		}

	}
	

}
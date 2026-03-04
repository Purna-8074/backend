package com.klef.controller;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 import com.klef.model.Student;
import com.klef.service.AdminService;
import com.klef.service.StudentService;
 
 
@RestController
@RequestMapping("studentapi")
public class StudentController {

 	 
	@Autowired private StudentService studentService;
	@Autowired private AdminService adminService;
	
	 @GetMapping("/")
	 public String studenthome() 
	 {
		 return "student controller home page";
	 }
	 
	 @PostMapping("/login")
	    public ResponseEntity<?> checkFacultyLogin(@RequestBody Student s)
	    {
	    	try {
	    	Student student=studentService.checkStudentLogin(s);
	    	if(student!=null) {
	    		return ResponseEntity.status(200).body(student);
	    	}else {
	    		return ResponseEntity.status(401).body("Student Login Failed");
	    	}
	    	}
	    	catch(Exception e) {
	    		return ResponseEntity.status(500).body(e.getMessage());
	    	}
	    }
	 
	 @GetMapping("/viewallstudents")
	 public ResponseEntity<?> viewallstudents()
	 {
		 List<Student>students=adminService.viewAllStudents();
		 if(students.size()>0) {
			 return ResponseEntity.status(200).body(students);
		 }else {
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Student Data Not Found");
		 }
	 }
	 
	 
	 
}

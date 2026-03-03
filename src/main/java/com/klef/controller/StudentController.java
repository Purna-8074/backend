package com.klef.controller;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
@RequestMapping("studentapi")
public class StudentController {

 	 
	 @GetMapping("/")
	 public String studenthome() 
	 {
		 return "student controller home page";
	 }
	 
 
	 
}

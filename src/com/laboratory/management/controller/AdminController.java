package com.laboratory.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("")
public class AdminController {
	
	@RequestMapping("listTeacher")
	public String listTeacher() {
		
		return "admin/listTeache";
		
	}
	
	@RequestMapping("listApplication")
	public String listApplication() {
		
		return "admin/listApplication";
	}
	
	@RequestMapping("listCourse")
	public String listCourse() {
		
		return "admin/listCourse";
		
	}
	
	@RequestMapping("listClassroom")
	public String listClassroom() {
		
		return "admin/listClassroom";
	}
	
	@RequestMapping("loadTeacher")
	public String loadTeacher() {
		
		return "admin/loadTeacher";
	}
	
	@RequestMapping("listInstitute")
	public String listInstitute() {
		
		return "admin/listInstitute";
	}

}

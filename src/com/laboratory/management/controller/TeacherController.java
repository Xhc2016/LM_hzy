package com.laboratory.management.controller;


//import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laboratory.management.pojo.Application;
import com.laboratory.management.pojo.Course;
import com.laboratory.management.pojo.User;
import com.laboratory.management.service.TeacherService;

@Controller
@RequestMapping("")
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	
	
	
	@RequestMapping("toApply")
	public ModelAndView toApply(HttpSession session) {
		
		User teacher = (User) session.getAttribute("teacher");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("teacher",teacher);
		
		modelAndView.setViewName("teacher/application/newCreateApplication");
		
		return modelAndView;
		
	}
	
	@RequestMapping("applicationList")
	public ModelAndView applicationList(HttpSession session) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		User teacher = (User) session.getAttribute("user");
		
		
		System.out.println(teacher.toString());
		//List applicationList
		
		modelAndView.setViewName("teacher/application/listTeacherApplication");
		
		return modelAndView;
		
	}

	 
	@RequestMapping("submitApplication")
	public ModelAndView submitApplication( Application application) {
		
		
		System.out.println("hhhhhhhhhhhh");
		
		//String applyResult = teacherService.createApplication(application);
		
		ModelAndView modelAndView = new ModelAndView();
		
		//modelAndView.addObject("applyResult",applyResult);
		
		
		
		modelAndView.setViewName("teacher/application/listTeacherApplication");
		
		//return modelAndView;
		
		System.out.println(application.toString());
		
		return modelAndView;
	}
	
	
	
	@RequestMapping("newSubmitApplication")
	public ModelAndView submitApplication(
			HttpSession session,
			Application application,
			Course course
			) {
		
		
		
		User teacher = (User) session.getAttribute("user");
	
		System.out.println(teacher.toString());
		
		
		
		System.out.println(application.toString());
		
		System.out.println(course.toString());
		
		return new ModelAndView("teacher/index");
		
	}
	

}

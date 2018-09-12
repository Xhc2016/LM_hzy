package com.laboratory.management.controller;


import javax.annotation.Resource;

//import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.laboratory.management.pojo.Application;
import com.laboratory.management.pojo.Course;
import com.laboratory.management.pojo.User;
import com.laboratory.management.service.ApplicationService;
import com.laboratory.management.service.InstitueteService;
import com.laboratory.management.service.TeacherService;

@Controller
@RequestMapping("")
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	@Autowired
	InstitueteService institueteService;
	@Autowired
	ApplicationService applicationService;
	
	
	
	
	@RequestMapping("toApply")
	public ModelAndView toApply(HttpSession session) {
		
		User teacher = (User) session.getAttribute("teacher");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("teacher",teacher);
		
		modelAndView.addObject("instituteList",institueteService.institutesList());
		
		//System.out.println(institueteService.institutesList());
		
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
	
	
	
	@ResponseBody
	@RequestMapping("newSubmitApplication")
	public String submitApplication(
			HttpSession session,
			Application application,
			Course course
			) {
		
		
		
		User user = (User) session.getAttribute("user");
	
		//System.out.println(teacher.toString());
		
		application.setUser(user);
		
		application.setCourse(course);
		
		applicationService.createApplication(application);
		
		//System.out.println(application.toString());
		
		//System.out.println(course.toString());
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("data", "succcccccces");
		
		return jsonObject.toJSONString();
		
	}
	

}

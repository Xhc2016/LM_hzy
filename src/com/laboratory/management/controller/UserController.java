package com.laboratory.management.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.laboratory.management.pojo.User;
import com.laboratory.management.service.UserService;

/**
 * @author 13986
 *2018-7-30
 *22:45
 */
@Controller
@RequestMapping("")
public class UserController {
	@Autowired 
	UserService userService;
	
	@RequestMapping("login")
	public ModelAndView login(String userId,String password,HttpSession session) {
		
		
		
		User user = userService.login(userId, password);
		
		ModelAndView modelAndView = new ModelAndView();
		  
		if(user == null ) {
			
			modelAndView.addObject("message","password OR userId error");
			
			modelAndView.setViewName("fore/home");
			
			return modelAndView;
		}
		
		
		
		
		if(user.getRole() == 0) {
			
			session.setAttribute("user", user);
			
			modelAndView.setViewName("admin/adminIndex");
			
			//return modelAndView;
			
		}
		
		else if(user.getRole() == 1) {
			
			
			session.setAttribute("user", user);
			//ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("teacher/index");
			
			//return modelAndView;
			
			
		}
		
		//System.out.println(modelAndView.getViewName());
		
		System.out.println(user.toString());
		
		return modelAndView;
			
	}
	
	
	
	@RequestMapping("loginOut")
	public ModelAndView loginOut(HttpSession session) {
		
		session.removeAttribute("user");
		
		ModelAndView modelAndView = new ModelAndView("fore/home");
		
		return modelAndView;
		
		
		
	}
	
	

}

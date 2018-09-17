package com.laboratory.management.controller;

//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 13986
 *2018-7-30
 *10:12
 */
@Controller
@RequestMapping("")
public class ForeController {
	
	@RequestMapping("forehome")
	public ModelAndView forehome() {
		
		ModelAndView modelAndView = new  ModelAndView("fore/home");
		
		return modelAndView;
		
	}
	
	@RequestMapping("toLogin")
	public ModelAndView toLogin() {
		
		ModelAndView modelAndView = new ModelAndView("fore/home");
		
		return modelAndView;
	}
	
	
	
	@RequestMapping("findPassword")
	public ModelAndView findPassword() {
		
		return (new ModelAndView("fore/findPassword"));
	}
	
	
	/*
	
	@ResponseBody
	@RequestMapping("submitCategory")
	public String submitCategory() {
		
		
		
	}
	*/
	
	
	

}

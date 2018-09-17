package com.laboratory.management.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.laboratory.management.pojo.Application;
import com.laboratory.management.pojo.Classroom;
import com.laboratory.management.pojo.PassedClass;
import com.laboratory.management.service.AdminService;

@Controller
@RequestMapping("")
public class AdminController
{
	@Autowired
	AdminService adminService;  
	
	@RequestMapping("choseClassroom")//
	public ModelAndView choseClassroom()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("classroom/choseClassroom");
		return modelAndView;
	}
	@RequestMapping("checkApplication")
	public ModelAndView checkApplication()
	{

		ModelAndView mav=new ModelAndView();
		
		List<Application> applications=adminService.listApplication();
		
		
		mav.addObject("is", applications);
		
		mav.setViewName("admin/checkApplication");	
		
		return mav;
	}
	@RequestMapping(value="selectClassroom",method=RequestMethod.POST)
	public ModelAndView selectClassroom(@RequestParam("selectString") String district)
	{
		List<Classroom> classrooms=adminService.selectDistrict(district);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("cs_classroom", classrooms);
		modelAndView.setView(new MappingJackson2JsonView());
		return modelAndView;
		
	}
	@RequestMapping(value="select_Application_two",method=RequestMethod.POST)
	public ModelAndView to_checkApplication(@RequestParam("selectDistrict") String class_campus,
			@RequestParam("checkWeek") String week)
	{
		//week="____"+week+"__";
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("admin/checkApplication");
		System.out.println(class_campus+"---"+week);
		List<Application> applications=adminService.select2Application(class_campus, week);
		modelAndView.addObject("cs", applications);
		return modelAndView;
	}
	@RequestMapping(value="select_passed_class_all")
	public ModelAndView select_passed_class_all()
	{
		
		List<PassedClass> passedClasses=adminService.listPassedClass();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("cs", passedClasses);
		modelAndView.setViewName("admin/checkApplication");
		return modelAndView;
	}
	
	@RequestMapping(value="select_passed_class_three",method=RequestMethod.POST)
	public ModelAndView select_passed_class_three(@RequestParam("district")String district,
			@RequestParam("classroomId")String classroomId,@RequestParam("theDay")String theDay)
	{


		System.out.println("district="+district+" classroomId= "+classroomId+" theDay= "+theDay);

		ModelAndView modelAndView =new ModelAndView();
		List<PassedClass> passedClasses=adminService.listPassedClass_three(district, classroomId, theDay);
		modelAndView.addObject("cs", passedClasses);
		List<Application> applications=adminService.listApplication();
		modelAndView.addObject("is", applications);
		modelAndView.setViewName("admin/checkApplication");
		return modelAndView;
	}
	
	@RequestMapping(value="addPassedClass",method=RequestMethod.POST)
	public ModelAndView addPassedClass(PassedClass passedClass)
	{
		System.out.println("addPassedClass");
		adminService.addPassedClass(passedClass);
		return null;
	}
	
	@RequestMapping("listClassroom")
	public ModelAndView listClassroom()
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Classroom> classrooms=adminService.listClassroom();
		modelAndView.addObject("cs", classrooms);
		modelAndView.setViewName("classroom/listClassroom");
		return modelAndView;
	}
	@RequestMapping("listClassroom_json")
	public ModelAndView listClassroom_json()
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Classroom> classroms=adminService.listClassroom();
		modelAndView.addObject("cs_classroom", classroms);
		modelAndView.setView(new MappingJackson2JsonView());
		return modelAndView;
	}
	@RequestMapping("to_addClassroom")
	public ModelAndView toAddClassroom()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("classroom/addClassroom");
		return modelAndView;
	}
	@RequestMapping("addClassroom")
	public ModelAndView addClassroom(Classroom classroom)
	{
		ModelAndView modelAndView=new ModelAndView();
		adminService.addClassroom(classroom);
		modelAndView.setViewName("redirect:listClassroom");
		return modelAndView;
	}
	@RequestMapping(value="deleteClassroom",method=RequestMethod.GET)
	public ModelAndView deleteClassroom(@RequestParam("id") int id)
	{
		ModelAndView modelAndView=new ModelAndView();
		adminService.delete(id);
		modelAndView.setViewName("redirect:listClassroom");
		return modelAndView;
	}

	
	@RequestMapping("examine")
	public ModelAndView examine()
	{
		List<Application> applications=adminService.listApplication();
		ModelAndView mav=new ModelAndView("admin");
		mav.addObject("cs", applications);
		mav.setViewName("admin/examine");
		return mav;
	}
	@RequestMapping("deleteApplication")
	public ModelAndView deleteApplication(@RequestParam int classId)
	{
		adminService.delete(classId);
		ModelAndView mav=new ModelAndView("admin");
		mav.setViewName("redirect:examine");
		return mav;
	}
	@RequestMapping("addApplication")
	public ModelAndView addCategory()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:toApply");
		return mav;
	}
	@RequestMapping("updateApplication")
	public ModelAndView updateApplication(HttpSession session,@RequestParam("classId")int classId)
	{
		Application application=adminService.get(classId);
		session.setAttribute("application", application);
		ModelAndView mav=new ModelAndView("admin");
		/*mav.addObject("application", application);*/
		mav.setViewName("admin/updateApplication");
		return mav;
	}
	@RequestMapping(value="to_updateApplication",method=RequestMethod.POST)
	public ModelAndView toUpdateApplication(HttpSession session)
	{
		Application application=(Application) session.getAttribute("application");
		ModelAndView mav=new ModelAndView("admin");
		adminService.update(application);
		mav.setViewName("redirect:examine");
		return mav;
	}
}

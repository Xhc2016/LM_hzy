package com.laboratory.management.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratory.management.mapper.AdminMapper;
import com.laboratory.management.mapper.ApplicationMapper;
import com.laboratory.management.mapper.ClassroomMapper;
import com.laboratory.management.mapper.PassedClassMapper;
import com.laboratory.management.pojo.Application;
import com.laboratory.management.pojo.Classroom;
import com.laboratory.management.pojo.PassedClass;
import com.laboratory.management.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	ClassroomMapper classroomMapper;

	
	public void deleteClassroom(int id) 
	{
		classroomMapper.delete(id);
	}
	
	
	public int addClassroom(Classroom classroom) 
	{
		classroomMapper.add(classroom);
		return 0;
	}
	
	
	public List<Classroom> selectDistrict(String district) 
	{

		return classroomMapper.selectDistrict(district);
	}
	
	
	public List<Classroom> listClassroom() 
	{

		return classroomMapper.list();
	}

	@Autowired
	AdminMapper adminMapper;

	public List<Application> listApplication() 
	{
		return adminMapper.list();
	}

	public void delete(int classId) 
	{
		
		adminMapper.delete(classId);
	}

	public Application get(int classId)
	{
		
		return adminMapper.get(classId);
	}

	public void update(Application application) 
	{
		adminMapper.update(application);
	}

	@Autowired
	ApplicationMapper applicationMapper;
	
	public List<Application> select2Application(String class_campus,String week)
	{
		//return applicationMapper.select2Application(class_campus, week);
		
		return null;
	}


	@Autowired
	PassedClassMapper passedClassMapper;
	public List<PassedClass> listPassedClass() 
	{

		return passedClassMapper.list();
	}


	@Override
	public List<PassedClass> listPassedClass_three(String district, String classroomId, String theDay)
	{

		return passedClassMapper.list_three(district, classroomId, theDay);
	}

	
	public  void addPassedClass(PassedClass passedClass) 
	{
		passedClassMapper.add(passedClass);
	}
}
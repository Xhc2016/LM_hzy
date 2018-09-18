package com.laboratory.management.service;

import java.util.List;

import com.laboratory.management.pojo.Application;
import com.laboratory.management.pojo.Classroom;
import com.laboratory.management.pojo.PassedClass;

public interface AdminService 
{
	
	public void deleteClassroom(String classroomId);
	
	public void addClassroom(Classroom classroom);
	
	public List<Classroom> selectClassroomByCampus(String campus);
	
	public List<Classroom> listClassroom();
	
	public List<Application> listApplication();
	
	public void updateApplication(Application application);
	
	public List<Application> selectApplicationBy(String classCampus,String week);
	
	public List<PassedClass> listPassedClass();
	
	public List<PassedClass> listPassedClassBy(String campus,String classroomId,String theDay );
	
	public void addPassedClass(PassedClass passedClass);
	
}

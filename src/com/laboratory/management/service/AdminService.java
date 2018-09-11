package com.laboratory.management.service;

import java.util.List;

import com.laboratory.management.pojo.Application;
import com.laboratory.management.pojo.Classroom;
import com.laboratory.management.pojo.PassedClass;

public interface AdminService 
{
	List<Application> listApplication();

	void delete(int classId);
	
	Application get(int classId);

	void update(Application application);

	
	
	void deleteClassroom(int id);
	
	int addClassroom(Classroom classroom);
	
	List<Classroom> selectDistrict(String district);
	
	List<Classroom> listClassroom();
	
	List<Application> select2Application(String class_campus,String week);
	
	List<PassedClass> listPassedClass();
	
	List<PassedClass> listPassedClass_three(String district,String classroomId,String theDay );
	
	void addPassedClass(PassedClass passedClass);
	
}

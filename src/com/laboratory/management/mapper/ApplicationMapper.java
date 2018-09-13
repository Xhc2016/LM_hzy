
package com.laboratory.management.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//import java.util.List;

import com.laboratory.management.pojo.Application;

public interface ApplicationMapper {
	
	public List<Application> listApplicationByTeacherId(String teacherId);
	
	public List<Application> listApplication(); //列出所有申请
	
	public List<Application> listApplicationByApplicationState(String state); //根据申请的状态 
	 
	//public List<Application> list();

	//public void delete(int classId);
	
	//public Application get(int classId);

	public void updateApplication(Application application);
	
	public void deleteApplcation(String applicationId);
	
	//public List<Application> select2Application(@Param("class_campus")String classCampus,@Param("week")String week);

	public void createApplication(Application application);

}

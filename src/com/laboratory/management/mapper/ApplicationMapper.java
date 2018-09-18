
package com.laboratory.management.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Param;

//import java.util.List;

import com.laboratory.management.pojo.Application;

public interface ApplicationMapper {
	
	public List<Application> listApplicationByTeacherId(String teacherId);
	
	public List<Application> listApplication(); //列出所有申请
	
	public List<Application> listApplicationByApplicationState(String state); //根据申请的状态 

	public void updateApplication(Application application);//未完成
	
	public void deleteApplicationByApplicationId(String applicationId);

	public void saveApplication(Application application);
	
	public Application selectApplicationByApplicationId(String applicationId);

}

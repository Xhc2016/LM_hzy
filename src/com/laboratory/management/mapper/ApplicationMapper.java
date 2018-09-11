
package com.laboratory.management.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//import java.util.List;

import com.laboratory.management.pojo.Application;

public interface ApplicationMapper {
	
	
public String createApplication(Application application);
	
	public List<Application> teacherApplication(int teacherId);
	
	public List<Application> list();

	public void delete(int classId);
	
	public Application get(int classId);

	public void update(Application application);
	
	public List<Application> select2Application(@Param("class_campus")String classCampus,@Param("week")String week);

	public void teacherCreateApplication(Application application);

}

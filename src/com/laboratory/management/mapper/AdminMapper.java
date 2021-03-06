package com.laboratory.management.mapper;

import java.util.List;

import com.laboratory.management.pojo.Application;


public interface AdminMapper 
{
	public List<Application> list();

	public void delete(int classId);
	
	public Application get(int classId);

	public void update(Application application);
}

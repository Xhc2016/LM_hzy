package com.laboratory.management.service;

import java.util.List;

import com.laboratory.management.pojo.Application;

public interface ApplicationService {
	
	public void createApplication(Application application) throws Exception;
	
	public List<Application> listApplicationByTeacherId(String Id);
	
	public Application selectApplicationByApplicationId(String applicationId);

}

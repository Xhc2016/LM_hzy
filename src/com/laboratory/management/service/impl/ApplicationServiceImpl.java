package com.laboratory.management.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laboratory.management.mapper.ApplicationMapper;
import com.laboratory.management.mapper.CourseMapper;
import com.laboratory.management.pojo.Application;
import com.laboratory.management.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	ApplicationMapper applicationMapper;
	@Autowired
	CourseMapper courseMapper;
	
	
	@Transactional
	@Override
	public void createApplication(Application application) throws Exception {
		
		application.setApplicationId(UUID.randomUUID().toString().replaceAll("-",""));
		
		System.out.println(application);
		
		courseMapper.createCourse(application.getCourse());
		
		applicationMapper.saveApplication(application);
		
	}


	
	@Override
	public List<Application> listApplicationByTeacherId(String Id) {
        
		
		return applicationMapper.listApplicationByTeacherId(Id);
	}



	@Override
	public Application selectApplicationByApplicationId(String applicationId) {
		
		return applicationMapper.selectApplicationByApplicationId(applicationId);
	}
	
	
	
	
	

}

package com.laboratory.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	@Override
	public void createApplication(Application application) {
		
		
		System.out.println(application);
		
		courseMapper.createCourse(application.getCourse());
		
		applicationMapper.createApplication(application);
		
	}

}

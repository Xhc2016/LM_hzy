package com.laboratory.management.service.impl;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratory.management.mapper.ApplicationMapper;
import com.laboratory.management.pojo.Application;
import com.laboratory.management.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	ApplicationMapper applicationMapper;

	public String createApplication(Application application) {
		// TODO 自动生成的方法存根
		return null;
	}

	
	
	

	
}

package com.laboratory.management.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;

//import com.laboratory.management.mapper.ApplicationMapper;
import com.laboratory.management.pojo.Application;
import com.laboratory.management.service.ApplicationService;

public class ApplicationTest extends BaseTest {
	@Resource
	private ApplicationService applicationService;
	
	@Test
	public void listTest() {
		
		List<Application> list = applicationService.listApplicationByTeacherId("000002");
		
		System.out.println(list);
		
	}

}

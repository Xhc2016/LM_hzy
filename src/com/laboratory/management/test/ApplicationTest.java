package com.laboratory.management.test;

import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import com.laboratory.management.pojo.Application;
import com.laboratory.management.service.ApplicationService;

import net.sf.json.JSONObject;

public class ApplicationTest extends BaseTest {
	@Resource
	private ApplicationService applicationService;
	
	
	
	@Test
	public void listTest() {
		
		List<Application> list = applicationService.listApplicationByTeacherId("000002");
		
		System.out.println(list);
		
	}
	
	@Test
	public void selectTest() {
		
		System.out.println(applicationService.selectApplicationByApplicationId("e37248a4e20842feadfb974fb28e0d6e"));
		
	}
	
	
	@Test
	public void testA() {
		
		JSONObject jsonObject = new JSONObject();
		
		
		
		System.out.println(jsonObject);
		
		
	}
	

}

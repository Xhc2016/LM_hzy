package com.laboratory.management.mapper;

import java.util.List;

import com.laboratory.management.pojo.Institute;

/**
*@author ChenHao
*@Date 2018年8月21日下午5:46:15
*/



public interface InstituteMapper {
	public void addInstitute(String name);
	
	public void deleteInstitute(String insituteId);
	
	public Institute getInstitute(String insituteId);
	
	//public void update(int id);
	
	public void updateInstitute(Institute institute);
	
	public List<Institute> listInstitute();
	
	public int countInstitute();
}

package com.laboratory.management.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.laboratory.management.pojo.PassedClass;

public interface PassedClassMapper
{
	public List<PassedClass> list();
	
	public List<PassedClass> list_three(@Param("district")String district,@Param("classroomId")String classroomId,@Param("theDay")String theDay);
	
	public void add(PassedClass passedClass);
}
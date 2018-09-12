package com.laboratory.management.service.impl;

import java.util.List;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratory.management.mapper.InstituteMapper;
import com.laboratory.management.pojo.Institute;
import com.laboratory.management.service.InstitueteService;


@Service
public class InstituteServiceImpl implements InstitueteService {

	@Autowired
	InstituteMapper instituteMapper;
	
	
	@Override
	public List<Institute> institutesList() {
		return  instituteMapper.listInstitute();	
	}
}

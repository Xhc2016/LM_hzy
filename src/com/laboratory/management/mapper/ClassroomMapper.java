package com.laboratory.management.mapper;
import java.util.*;
import com.laboratory.management.pojo.Classroom;
public interface ClassroomMapper
{
	public int add(Classroom classroom);
	public void delete(int id);
	public List<Classroom> list();
	public List<Classroom> selectDistrict(String district);
	public int count();
}

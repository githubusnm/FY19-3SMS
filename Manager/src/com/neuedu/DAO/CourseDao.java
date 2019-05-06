package com.neuedu.DAO;

import com.neuedu.entity.Course;

public interface CourseDao {

	void insert(Course course);
	
	boolean findById(int id);
	
	void update(int id, Object o, Object op);
	
	void delete(int id);
	
}

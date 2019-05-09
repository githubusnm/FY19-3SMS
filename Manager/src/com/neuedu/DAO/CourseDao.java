package com.neuedu.DAO;

import java.util.List;

import com.neuedu.entity.Course;

public interface CourseDao {

	void insert(Course course);
	
	boolean findById(int id);
	
	void update(int id, Object o, Object op);
	
	void delete(int id);
	
	void findStudentByCourse(int id);
	
	public List<Course> findCourseByStudentId(int courseid);
	
}

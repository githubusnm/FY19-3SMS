package com.neuedu.DAO;

import java.util.List;

import com.neuedu.entity.Student;

public interface StudentDao {
	
	List<Student> select();
	
	void insert(Student student);
	
	boolean findById(int id);
	
	void delete(int id);
	
	void update(int id, Object op, Object o);
	
}

package com.neuedu.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuedu.DAO.CourseDao;
import com.neuedu.entity.Course;
import com.neuedu.util.DButils;

public class CourseManager implements CourseDao {

	public void insert(Course course) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("insert into CourseManager values(?,?)");) {
			prepareStatement.setInt(1, course.getCourse_id());
			prepareStatement.setString(2, course.getCourse_name());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean findById(int id) {
		boolean b = false;
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("select * from CourseManager where course_id =?");) {
			prepareStatement.setInt(1, id);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				String string = executeQuery.getString(2);
				if (string != null) {
					b = true;
					int cid = executeQuery.getInt(1);
					System.out.println("课程id：" + cid + "，课程名称：" + string);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	public void update(int id, Object column, Object newone) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("update CourseManager set " + column + " = ? where course_id = ?");) {
			prepareStatement.setObject(1, newone);
			prepareStatement.setInt(2, id);
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("delete from CourseManager where course_id = ?");) {
			prepareStatement.setInt(1, id);
			
			boolean findById = findById(id);
			if(findById == false) {
				System.out.println("课程不存在");
				return;
			}
			
			String student_name = findCourseById(id);
			if(student_name == null) {
				prepareStatement.executeUpdate();
				System.out.println("删除成功");
			}else {
				System.out.println("无法删除课程");
				return;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String findCourseById(int id) {

		String student_name = null;
		ResultSet executeQuery = null;
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("select * from StudentManager where course_id = ?");) {
			prepareStatement.setInt(1, id);
			executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				student_name = executeQuery.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				executeQuery.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student_name;
	}

}

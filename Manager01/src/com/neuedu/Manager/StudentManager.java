package com.neuedu.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.DAO.StudentDao;
import com.neuedu.entity.Student;
import com.neuedu.util.DButils;

public class StudentManager implements StudentDao {

	public List<Student> select() {
		List<Student> students = new ArrayList<>();
		ResultSet executeQuery = null;
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection.prepareStatement("select * from StudentManager");) {
			executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				int student_id = executeQuery.getInt(1);
				String student_name = executeQuery.getString(2);
				int course_id = executeQuery.getInt(3);
				Student student = new Student(student_id, student_name, course_id);
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				executeQuery.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(students);
		return students;
	}

	public void insert(Student student) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("insert into StudentManager values(?,?,?)");) {
			prepareStatement.setInt(1, student.getStudent_id());
			prepareStatement.setString(2, student.getStudent_name());
			prepareStatement.setInt(3, student.getCourse_id());
			prepareStatement.executeUpdate();
			System.out.println("添加成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean findById(int id) {
		boolean b = false;
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("SELECT * FROM studentmanager " + 
								" JOIN coursemanager " + 
								" ON studentmanager.course_id = coursemanager.course_id" + 
								" WHERE student_id = " + id);) {
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				String string = executeQuery.getString(2);
				if (string != null) {
					b = true;
					int sid = executeQuery.getInt(1);
					String sname = executeQuery.getString(2);
					int cid = executeQuery.getInt(3);
					String scourse = executeQuery.getString(5);
					System.out.println("学生id：" + sid + "，学生姓名：" + sname + "，学生课程id：" + cid + ",学生课程名称：" + scourse);
					return b;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	public void delete(int id) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("delete from StudentManager where student_id =" + id);) {
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(int id, Object op, Object o) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("update StudentManager set " + o + " = ? where student_id = ?");) {
			prepareStatement.setObject(1, op);
			prepareStatement.setInt(2, id);
			prepareStatement.executeUpdate();
			System.out.println("修改成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.neuedu.Manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class CourseManager {

	static Properties prop;
	static {
		prop = new Properties();
		try {
			prop.load(Main.class.getResourceAsStream("/settings.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void insert(Course course) {
		try {
			Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			PreparedStatement prepareStatement = connection.prepareStatement("insert into CourseManager values(?,?)");
			prepareStatement.setInt(1, course.getCourse_id());
			prepareStatement.setString(2, course.getCourse_name());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean findById(int id) {
		boolean b = false;
		try {
			Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			PreparedStatement prepareStatement = connection
					.prepareStatement("select * from CourseManager where course_id =?");
			prepareStatement.setInt(1, id);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				String string = executeQuery.getString(2);
				if (string != null) {
					b = true;
					int cid = executeQuery.getInt(1);
					System.out.println("¿Î³Ìid£º" + cid + "£¬¿Î³ÌÃû³Æ£º" + string);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	public void update(int id, Object o, Object op) {
		try {
			Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			PreparedStatement prepareStatement = connection
					.prepareStatement("update CourseManager set " + o + " = ? where course_id = ?");
			prepareStatement.setObject(1, op);
			prepareStatement.setInt(2, id);
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try {
			Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			PreparedStatement prepareStatement = connection
					.prepareStatement("delete from CourseManager where course_id = ?");
			ResultSet executeQuery = prepareStatement.executeQuery();
			prepareStatement.setInt(1, id);
			while (executeQuery.next()) {

			}
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

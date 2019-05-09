package com.neuedu.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	@SuppressWarnings("null")
	public boolean findById(int id) {
		ResultSet executeQuery = null;
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("select * from CourseManager where course_id =?");) {
			prepareStatement.setInt(1, id);
			executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				String string = executeQuery.getString(2);
				if (string != null) {
					int cid = executeQuery.getInt(1);
					System.out.println("课程id：" + cid + "，课程名称：" + string);
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (executeQuery == null) {
				try {
					executeQuery.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
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
			if (findById == false) {
				System.out.println("课程不存在");
				return;
			}

			String student_name = findCourseById(id);
			if (student_name == null) {
				prepareStatement.executeUpdate();
				System.out.println("删除成功");
			} else {
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
						.prepareStatement("select course_id,course_name from CourseManager where course_id = ?");) {
			prepareStatement.setInt(1, id);
			executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				student_name = executeQuery.getString(2);
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
		return student_name;
	}

	public void findStudentByCourse(int id) {
		ResultSet executeQuery = null;
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection.prepareStatement(
						"select * from StudentManager " + " join studentcourse on sid = StudentManager.student_id "
								+ " where studentcourse.cid = ?");) {
			prepareStatement.setInt(1, id);
			executeQuery = prepareStatement.executeQuery();
			String student_name = null;
			while (executeQuery.next()) {
				int student_id = executeQuery.getInt(1);
				student_name = executeQuery.getString(2);
				System.out.println("学生id：" + student_id + "，学生姓名：" + student_name);
			}
			if (student_name == null) {
				System.out.println("课程目前无人选择");
				return;
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
	}

	public void insertStudentByCourseId(int sid, int cid) {
		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("insert into studentcourse values(?,?)");) {
			prepareStatement.setInt(1, sid);
			if (findCourseById(sid) == null) {
				System.out.println("学生不存在");
				return;
			}
			prepareStatement.setInt(2, cid);
			if (findCourseById(cid) == null) {
				System.out.println("课程不存在");
				return;
			}
			System.out.println(findCourseByCourseid(sid));
			if (findCourseByCourseid(sid) == false) {
				System.out.println("学生课程已存在");
				return;
			}
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("学生课程已存在");
		}
	}

	public boolean findCourseByCourseid(int cid) {
		List<Integer> arrayList = new ArrayList<>();
		int coursename = 0;
		Connection connection = DButils.getConnection();
		try {
			PreparedStatement prepareStatement = connection
					.prepareStatement("select cid from StudentCourse WHERE cid = "+cid);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				coursename = executeQuery.getInt("cid");
				System.out.println(coursename);
				arrayList.add(coursename);
			}
			System.out.println(arrayList);
			if (coursename == cid) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public List<Course> findCourseByStudentId(int courseid) {
		Connection connection = DButils.getConnection();
		ArrayList<Course> arrayList = new ArrayList<>();
		try {
			PreparedStatement prepareStatement = connection
					.prepareStatement("SELECT course_id,course_name FROM coursemanager " + " JOIN studentcourse "
							+ " ON cid = course_id" + " WHERE sid = ?");
			prepareStatement.setInt(1, courseid);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				int course_id = executeQuery.getInt(1);
				String coursename = executeQuery.getString(2);
				System.out.println(coursename);
				Course course = new Course(course_id, coursename);
				arrayList.add(course);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	public void deleteStudentByCourseId(int cid) {

		try (Connection connection = DButils.getConnection();
				PreparedStatement prepareStatement = connection
						.prepareStatement("delete from studentcourse WHERE cid = ?");) {
			prepareStatement.setInt(1, cid);
			if (findCourseById(cid) == null) {
				System.out.println("课程不存在");
				return;
			}
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.neuedu.View;

import java.util.List;
import java.util.Scanner;

import com.neuedu.Manager.CourseManager;
import com.neuedu.Manager.StudentManager;
import com.neuedu.entity.Course;

public class CourseView {

	Scanner scanner = new Scanner(System.in);
	CourseManager courseManager = new CourseManager();

	public void showView() {
		System.out.println("请选择服务：");
		System.out.println("==========");
		System.out.println("1.增加课程" + "\t" + "2.修改课程" + "\t" + "3.删除课程" + "\t" + "4.返回上层" + "\t" + "5.根据课程id查询学生"
				+ "\t" + "6.根据课程id添加学生" + "\t" + "7.根据课程id删除学生" + "\t" + "8.根据学生id查询学生课程");
		System.out.println("==========");
		switch (scanner.nextInt()) {
		case 1:
			Course course = new Course();
			System.out.println("请输入课程id：");
			int cid = scanner.nextInt();
			course.setCourse_id(cid);
			boolean fB = courseManager.findById(cid);
			if(fB == true) {
				System.out.println("课程已存在");
				showView();
			}
			System.out.println("请输入课程名称：");
			course.setCourse_name(scanner.next());
			System.out.println(course);
			courseManager.insert(course);
			System.out.println("添加成功");
			showView();
			break;
		case 2:
			System.out.println("请输入需要修改的id：");
			int id = scanner.nextInt();
			if(courseManager.findById(id) == false) {
				System.out.println("课程不存在");
				showView();
			}
			System.out.println("请输入需要修改的属性：");
			String o = scanner.next();
			if(o.substring(o.length()-2).equals("id")) {
				System.out.println("课程id无法修改");
				showView();
			}
			System.out.println("请输入修改后的值：");
			String op = scanner.next();
			courseManager.update(id, o, op);
			System.out.println("修改成功");
			showView();
			break;
		case 3:
			System.out.println("请输入要删除的课程id：");
			courseManager.delete(scanner.nextInt());
			showView();
			break;
		case 4:
			StudentView studentView = new StudentView();
			studentView.showView();
			break;
		case 5:
			System.out.println("请输入需要查询的课程id：");
			int findstudents = scanner.nextInt();
			if (courseManager.findById(findstudents) == false) {
				System.out.println("课程不存在");
				showView();
			}
			courseManager.findStudentByCourse(findstudents);
			showView();
			break;
		case 6:
			System.out.println("请输入需要添加的课程id：");
			int insertcourseid = scanner.nextInt();
			System.out.println("请输入学生id");
			int insertstudentid = scanner.nextInt();
			courseManager.insertStudentByCourseId(insertstudentid,insertcourseid);
			System.out.println("添加学生");
			showView();
			break;
		case 7:
			System.out.println("请输入需要删除的课程id：");
			courseManager.deleteStudentByCourseId(scanner.nextInt());
			System.out.println("删除成功");
			showView();
			break;
		case 8:
			StudentManager studentManager = new StudentManager();
			System.out.println("请输入需要查询的学生id");
			int courseid = scanner.nextInt();
			if (studentManager.findById(courseid) == false) {
				System.out.println("学生不存在");
				showView();
			}
			List<Course> findCourseByStudentId = courseManager.findCourseByStudentId(courseid);
			for (Course course2 : findCourseByStudentId) {
				System.out.println(course2);
			}
			showView();
			break;
		default:
			System.out.println("输入有误");
			showView();
			break;
		}
	}

}

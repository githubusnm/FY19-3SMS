package com.neuedu.Manager;

import java.util.Scanner;

public class CourseView {

	Scanner scanner = new Scanner(System.in);
	CourseManager courseManager = new CourseManager();

	public void showView() {
		System.out.println("请选择服务：");
		System.out.println("==========");
		System.out.println("1.增加课程" + "\t" + "2.修改课程" + "\t" + "3.删除课程");
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
			System.out.println("请输入需要修改的属性：");
			String o = scanner.next();
			System.out.println("请输入修改后的值：");
			String op = scanner.next();
			courseManager.update(id, o, op);
			System.out.println("修改成功");
			showView();
			break;
		case 3:
			System.out.println("请输入要删除的课程id：");
			courseManager.delete(scanner.nextInt());
			System.out.println("删除成功");
			showView();
			break;
		default:
			System.out.println("输入有误");
			showView();
			break;
		}
	}

}

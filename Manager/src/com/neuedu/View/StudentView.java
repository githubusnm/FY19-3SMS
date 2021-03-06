package com.neuedu.View;

import java.util.Scanner;

import com.neuedu.Manager.StudentManager;
import com.neuedu.entity.Student;

public class StudentView {

	Scanner scanner = new Scanner(System.in);
	StudentManager studentManager = new StudentManager();
	CourseView courseView = new CourseView();

	public void showView() {
		System.out.println("请选择服务：");
		System.out.println("==========");
		System.out.println("1.增加学生" + "\t" + "2.修改学生" + "\t" + "3.删除学生" + "\t" + "4.查询学生" + "\t" + "5.打印学生" + "\t"
				+ "6.课程管理" + "\t" + "7.系统退出");
		System.out.println("==========");
		switch (scanner.nextInt()) {
		case 1:
			Student student = new Student();
			System.out.println("请输入学生学号：");
			int id = scanner.nextInt();
			student.setStudent_id(id);
			boolean findById = studentManager.findById(id);
			if (findById == true) {
				System.out.println("学生已存在");
				showView();
			}
			System.out.println("请输入学生姓名：");
			student.setStudent_name(scanner.next());
			studentManager.insert(student);
			showView();
			break;
		case 2:
			System.out.println("请输入需要更改的学生id：");
			int updateid = scanner.nextInt();
			boolean findById2 = studentManager.findById(updateid);
			if (findById2 == false) {
				System.out.println("学生不存在");
				showView();
			}
			System.out.println("请输入需要更改的学生属性：");
			Object o = scanner.next();
			System.out.println("请输入更改后的学生的属性的值：");
			Object op = scanner.next();
			studentManager.update(updateid, op, o);
			showView();
			break;
		case 3:
			System.out.println("请输入要删除的学生的id：");
			int deleteid = scanner.nextInt();
			if(studentManager.findById(deleteid) == false) {
				System.out.println("学生不存在");
				showView();
			}
			studentManager.delete(deleteid);
			showView();
			break;
		case 4:
			System.out.println("请输入需要查询的id：");
			boolean fB = studentManager.findById(scanner.nextInt());
			if(fB != true) {
				System.out.println("用户不存在");
			}
			showView();
			break;
		case 5:
			studentManager.select();
			showView();
			break;
		case 6:
			courseView.showView();
			break;
		case 7:
			System.out.println("期待再次为您服务");
			System.exit(0);
			break;
		default:
			System.out.println("输入有误");
			showView();
			break;
		}
	}

}

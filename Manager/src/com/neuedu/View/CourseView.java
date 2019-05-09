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
		System.out.println("��ѡ�����");
		System.out.println("==========");
		System.out.println("1.���ӿγ�" + "\t" + "2.�޸Ŀγ�" + "\t" + "3.ɾ���γ�" + "\t" + "4.�����ϲ�" + "\t" + "5.���ݿγ�id��ѯѧ��"
				+ "\t" + "6.���ݿγ�id���ѧ��" + "\t" + "7.���ݿγ�idɾ��ѧ��" + "\t" + "8.����ѧ��id��ѯѧ���γ�");
		System.out.println("==========");
		switch (scanner.nextInt()) {
		case 1:
			Course course = new Course();
			System.out.println("������γ�id��");
			int cid = scanner.nextInt();
			course.setCourse_id(cid);
			boolean fB = courseManager.findById(cid);
			if(fB == true) {
				System.out.println("�γ��Ѵ���");
				showView();
			}
			System.out.println("������γ����ƣ�");
			course.setCourse_name(scanner.next());
			System.out.println(course);
			courseManager.insert(course);
			System.out.println("��ӳɹ�");
			showView();
			break;
		case 2:
			System.out.println("��������Ҫ�޸ĵ�id��");
			int id = scanner.nextInt();
			if(courseManager.findById(id) == false) {
				System.out.println("�γ̲�����");
				showView();
			}
			System.out.println("��������Ҫ�޸ĵ����ԣ�");
			String o = scanner.next();
			if(o.substring(o.length()-2).equals("id")) {
				System.out.println("�γ�id�޷��޸�");
				showView();
			}
			System.out.println("�������޸ĺ��ֵ��");
			String op = scanner.next();
			courseManager.update(id, o, op);
			System.out.println("�޸ĳɹ�");
			showView();
			break;
		case 3:
			System.out.println("������Ҫɾ���Ŀγ�id��");
			courseManager.delete(scanner.nextInt());
			showView();
			break;
		case 4:
			StudentView studentView = new StudentView();
			studentView.showView();
			break;
		case 5:
			System.out.println("��������Ҫ��ѯ�Ŀγ�id��");
			int findstudents = scanner.nextInt();
			if (courseManager.findById(findstudents) == false) {
				System.out.println("�γ̲�����");
				showView();
			}
			courseManager.findStudentByCourse(findstudents);
			showView();
			break;
		case 6:
			System.out.println("��������Ҫ��ӵĿγ�id��");
			int insertcourseid = scanner.nextInt();
			System.out.println("������ѧ��id");
			int insertstudentid = scanner.nextInt();
			courseManager.insertStudentByCourseId(insertstudentid,insertcourseid);
			System.out.println("���ѧ��");
			showView();
			break;
		case 7:
			System.out.println("��������Ҫɾ���Ŀγ�id��");
			courseManager.deleteStudentByCourseId(scanner.nextInt());
			System.out.println("ɾ���ɹ�");
			showView();
			break;
		case 8:
			StudentManager studentManager = new StudentManager();
			System.out.println("��������Ҫ��ѯ��ѧ��id");
			int courseid = scanner.nextInt();
			if (studentManager.findById(courseid) == false) {
				System.out.println("ѧ��������");
				showView();
			}
			List<Course> findCourseByStudentId = courseManager.findCourseByStudentId(courseid);
			for (Course course2 : findCourseByStudentId) {
				System.out.println(course2);
			}
			showView();
			break;
		default:
			System.out.println("��������");
			showView();
			break;
		}
	}

}

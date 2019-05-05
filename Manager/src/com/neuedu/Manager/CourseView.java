package com.neuedu.Manager;

import java.util.Scanner;

public class CourseView {

	Scanner scanner = new Scanner(System.in);
	CourseManager courseManager = new CourseManager();

	public void showView() {
		System.out.println("��ѡ�����");
		System.out.println("==========");
		System.out.println("1.���ӿγ�" + "\t" + "2.�޸Ŀγ�" + "\t" + "3.ɾ���γ�");
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
			System.out.println("��������Ҫ�޸ĵ����ԣ�");
			String o = scanner.next();
			System.out.println("�������޸ĺ��ֵ��");
			String op = scanner.next();
			courseManager.update(id, o, op);
			System.out.println("�޸ĳɹ�");
			showView();
			break;
		case 3:
			System.out.println("������Ҫɾ���Ŀγ�id��");
			courseManager.delete(scanner.nextInt());
			System.out.println("ɾ���ɹ�");
			showView();
			break;
		default:
			System.out.println("��������");
			showView();
			break;
		}
	}

}

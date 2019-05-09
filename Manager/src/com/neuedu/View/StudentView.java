package com.neuedu.View;

import java.util.Scanner;

import com.neuedu.Manager.StudentManager;
import com.neuedu.entity.Student;

public class StudentView {

	Scanner scanner = new Scanner(System.in);
	StudentManager studentManager = new StudentManager();
	CourseView courseView = new CourseView();

	public void showView() {
		System.out.println("��ѡ�����");
		System.out.println("==========");
		System.out.println("1.����ѧ��" + "\t" + "2.�޸�ѧ��" + "\t" + "3.ɾ��ѧ��" + "\t" + "4.��ѯѧ��" + "\t" + "5.��ӡѧ��" + "\t"
				+ "6.�γ̹���" + "\t" + "7.ϵͳ�˳�");
		System.out.println("==========");
		switch (scanner.nextInt()) {
		case 1:
			Student student = new Student();
			System.out.println("������ѧ��ѧ�ţ�");
			int id = scanner.nextInt();
			student.setStudent_id(id);
			boolean findById = studentManager.findById(id);
			if (findById == true) {
				System.out.println("ѧ���Ѵ���");
				showView();
			}
			System.out.println("������ѧ��������");
			student.setStudent_name(scanner.next());
			studentManager.insert(student);
			showView();
			break;
		case 2:
			System.out.println("��������Ҫ���ĵ�ѧ��id��");
			int updateid = scanner.nextInt();
			boolean findById2 = studentManager.findById(updateid);
			if (findById2 == false) {
				System.out.println("ѧ��������");
				showView();
			}
			System.out.println("��������Ҫ���ĵ�ѧ�����ԣ�");
			Object o = scanner.next();
			System.out.println("��������ĺ��ѧ�������Ե�ֵ��");
			Object op = scanner.next();
			studentManager.update(updateid, op, o);
			showView();
			break;
		case 3:
			System.out.println("������Ҫɾ����ѧ����id��");
			int deleteid = scanner.nextInt();
			if(studentManager.findById(deleteid) == false) {
				System.out.println("ѧ��������");
				showView();
			}
			studentManager.delete(deleteid);
			showView();
			break;
		case 4:
			System.out.println("��������Ҫ��ѯ��id��");
			boolean fB = studentManager.findById(scanner.nextInt());
			if(fB != true) {
				System.out.println("�û�������");
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
			System.out.println("�ڴ��ٴ�Ϊ������");
			System.exit(0);
			break;
		default:
			System.out.println("��������");
			showView();
			break;
		}
	}

}

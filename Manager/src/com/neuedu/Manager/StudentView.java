package com.neuedu.Manager;

import java.util.Scanner;

public class StudentView {

	Scanner scanner = new Scanner(System.in);
	StudentManager studentManager = new StudentManager();

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
			System.out.println("������ѧ���γ�id��");
			student.setCourse_id(scanner.nextInt());
			studentManager.insert(student);
			showView();
			break;
		case 2:
			System.out.println("��������Ҫ���ĵ�ѧ��id��");
			int updateid = scanner.nextInt();
			System.out.println("��������Ҫ���ĵ�ѧ�����ԣ�");
			Object o = scanner.next();
			System.out.println("��������ĺ��ѧ�������Ե�ֵ��");
			Object op = scanner.next();
			studentManager.update(updateid, op, o);
			showView();
			break;
		case 3:
			System.out.println("������Ҫɾ����ѧ����id��");
			studentManager.delete(scanner.nextInt());
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
			
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.out.println("��������");
			showView();
			break;
		}
	}

}

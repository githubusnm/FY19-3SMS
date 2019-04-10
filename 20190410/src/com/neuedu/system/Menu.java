package com.neuedu.system;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

	Scanner scanner = new Scanner(System.in);
//	String[] students = new String[] {"3","����","��","45","�߼�","�����в�ƽ������㳡","12345678900","123@qwer.com"};
	int[] students = { 3 };

	public void showMenu() {
		System.out.println("***********��ѡ��Ҫ��������Ϣ��Ӧ����**********************");
		System.out.print("*");

		System.out.print("1.�鿴ѧ����Ϣ");
		System.out.print("2.���ѧ����Ϣ");
		System.out.print("3.ɾ��ѧ����Ϣ");
		System.out.print("4.�޸�ѧ����Ϣ");
		System.out.print("5.�˳�");

		System.out.println("*");
		System.out.println("**************************************************");
		System.out.print("��ѡ��");

		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextInt()) {
		case 1:
			this.showStudent();
			break;
		case 2:
			this.addStudent();
			break;
		case 3:
			this.deleteStudent();
			break;
		case 4:
			this.changeStudent();
			break;
		case 5:
			this.exit();
			return;
		default:
			break;
		}

	}

	public void showStudent() {
		this.showMenu();

	}

	public void addStudent() {
		System.out.println("***************���ѧ����Ϣ***************");
		System.out.print("������ѧ��id:");
		int i = scanner.nextInt();
		if (students[0] == i) {
			System.out.println("��ID" + i + "�Ѵ��ڣ�����������");
			System.out.print("������ѧ��id:");
		}
		System.out.print("������ѧ��������");
		scanner.next();
		System.out.print("������ѧ���Ա�");
		scanner.next();
		System.out.print("������ѧ�����䣺(1~120�ڵ�����)");
		int age = scanner.nextInt();
		if (age < 1 || age > 120) {
			return;
		}
		System.out.print("������ѧ�������꼶��(ֻ�ܳ������м����߼�)");
		String[] levels = { "����", "�м�", "�߼�" };
//		String level = scanner.next();
//		System.out.println(Arrays.toString(levels));
//		System.out.println(level);
//		for (int j = 0; j < levels.length - 1; j++) {
//			if (levels[j].equals(level)) {
//				System.out.print("�������ַ��");
//				scanner.next();
//				String[] phoneNumbers = new String[11];
//				System.out.print("������ѧ����ϵ��ʽ��(11λ�ֻ�����)");
//				String phoneNumber = scanner.next();
//				if (phoneNumber.length() != phoneNumbers.length) {
//					return;
//				}
//				System.out.print("������ѧ���������䣺(����@��.com)");
//				scanner.next();
//			}
//
//		}
		
		String str = scanner.next();
		for (String level : levels) {
			if(level.equals(str)) {
				System.out.print("�������ַ��");
				scanner.next();
				String[] phoneNumbers = new String[11];
				System.out.print("������ѧ����ϵ��ʽ��(11λ�ֻ�����)");
				String phoneNumber = scanner.next();
				if (phoneNumber.length() != phoneNumbers.length) {
					return;
				}
				System.out.print("������ѧ���������䣺(����@��.com)");
				scanner.next();
				}
			}
		}
		
	

	public void deleteStudent() {
		System.out.println("3");
	}

	public void changeStudent() {

		Change change = new Change();
		System.out.println("**************************************************");
		System.out.print("1.����ID�޸�ѧ��ȫ����Ϣ");
		System.out.print("2.����ID�޸�ѧ��������Ϣ");
		System.out.print("3.�����ϼ�Ŀ¼");
		System.out.print("4.ϵͳ�Ƴ�");
		switch (scanner.nextInt()) {
		case 1:
			change.changeByIdAll();
			break;
		case 2:
			change.changeByIdPart();
			break;
		case 3:
			change.backLast();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			break;
		}

	}

	public void exit() {
		System.out.println("5");
		return;
	}

	public void backToMenu() {
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		this.showMenu();
	}
}

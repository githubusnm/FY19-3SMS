package com.neuedu.system;

import java.util.Scanner;

public class Login {

	public void login() {
		System.out.println("����������������ӭ��¼ѧ����Ϣ����ϵͳ������������");
		System.out.println("1.��¼" + "\t" + "2.�˳�");
		System.out.println(".....................................");
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ѡ��");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.print("�������û�����");
			String mima = "admin";
			if (scanner.next().equals(mima)) {
				System.out.print("���������룺");
			} else {
				System.out.println("�û�������");
				return;
			}
			if (scanner.next().equals(mima)) {
				System.out.println("��¼�ɹ�");
			} else {
				System.out.println("�������");
				return;
			}
			System.out.println("��ӭ����" + mima);
			break;
		case 2:
			return;
		default:
			return;
		}
		Menu menu = new Menu();
		menu.showMenu();
		menu.backToMenu();
	}
}

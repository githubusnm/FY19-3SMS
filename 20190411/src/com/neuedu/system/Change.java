package com.neuedu.system;

import java.util.Scanner;

public class Change extends Menu {

	Scanner scanner = new Scanner(System.in);
	public void changeByIdAll() {
		System.out.println("**************************************************");
		System.out.print("*");
		System.out.print("1.�鿴����ѧ����Ϣ");
		System.out.print("2.����id�鿴ѧ����Ϣ");
		System.out.print("3.����id�鿴ѧ������");
		System.out.println("4.������һ��");
		System.out.println("**************************************************");
		System.out.print("�����룺");
		int i = scanner.nextInt();
		Show show = new Show();
		switch (i) {
		case 1:
			show.showAll();
			break;
		case 2:
			show.showById();
			break;
		case 3:
			show.showByIdName();
			break;
		case 4:
			this.changeStudent();
			break;

		default:
			break;
		}
	}
	public void changeByIdPart() {
		System.out.print("������Ҫ�޸ĵ�id");
		scanner.nextInt();
		System.out.print("������Ҫ�޸ĵ�����");
		scanner.next();
		System.out.print("������Ҫ�޸ĺ��ֵ");
		scanner.next();
		System.out.println("�޸ĳɹ�");
		this.changeStudent();
		
	}
	public void backLast() {
		System.out.println("ϵͳ�Զ������ϲ�Ŀ¼~");
		this.changeStudent();
	}

}

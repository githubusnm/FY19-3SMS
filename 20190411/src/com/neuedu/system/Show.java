package com.neuedu.system;

import java.util.Scanner;

public class Show extends Menu {
	Scanner scanner = new Scanner(System.in);
	public void showAll() {
		
	}
	public void showById() {
		System.out.print("��ѡ��Ҫ��ѯ��ID");
		scanner.nextInt();
		System.out.println("--------------����ѧ����Ϣ-------------------");
		System.out.println("|ѧ��          |����          |����          |�绰                                  |Email 		     |��ַ");
		System.out.println("-----------------------------------------");
		System.out.println("|3     |����          |100   |12345678900   |123@12.com      |�����в�ƽ������㳡");
		System.out.println("-----------------------------------------");
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼~");
		this.showStudent();
	}
	public void showByIdName() {
		
	}
}

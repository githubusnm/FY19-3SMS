package com.neuedu.system;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {

	static String userName = "admin";
	static String passWord = "admin";
	
	//����scanner��
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//����һ���ͻ���
		StudentClient studentclient = new StudentClient();
		studentclient.welcomePage();
	}
	
	//ɾ��һ��studentManger����
	StudentManager sm = new StudentManager(this);
	
	
	//��ӭ����
	public void welcomePage() {
		System.out.println("��ӭ��¼ѧ������ϵͳ");
		System.out.println("1.��¼                               2.�˳�");
		System.out.println("******************************************");
		//�����û������1��2
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼");
			System.out.println("�����룺");
			String userName = scanner.next();
			System.out.println("���������룺");
			String psw = scanner.next();
			Admin admin = new Admin(userName,psw);
			boolean login = login(admin);
			if(login == true) {
				System.out.println("��ӭ��"+userName+"��¼");
				stuManagerIndex();
			}else {
				System.out.println("��½ʧ��");
				welcomePage();
			}
			
			break;
		case 2:
			System.out.println("�˳���");
			System.exit(0);
			break;
		
		default:
			System.out.println("��������");
			welcomePage();
			break;
		}
		
		
	}
	
	
	
	//��¼����
	public boolean login(Admin admin) {
	
		
		//�жϴ���������û��������Ƿ�һ��
		if(userName.equals(admin.username) && passWord.equals(passWord)) {
			return true;
		}else {
			return false;
		}
	}
	//�˳�ϵͳ
	public void exitSystem() {
		System.exit(0);
	}
	
	//ѧ���������ҳ
	public void stuManagerIndex() {
		System.out.println("��ѡ��Ҫ��������Ϣ������");
		System.out.println("1.�鿴ѧ����Ϣ  2.���ѧ����Ϣ 3.ɾ��ѧ����Ϣ 4.�޸�ѧ����Ϣ 5.�˳�");
		System.out.println("**************************");
		System.out.println("��ѡ��");
		//���������ѡ��
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			break;
		case 2:
			sm.addStuPage(scanner);
			break;
		default:
			break;
		}
		
		
	}
	
	
}

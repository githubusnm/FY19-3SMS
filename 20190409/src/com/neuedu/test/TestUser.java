package com.neuedu.test;

import java.util.Scanner;

public class TestUser {

	public static void main(String[] args) {
		Test2 test = new Test2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����û�����");
		String username = scanner.next();
		System.out.println("�������룺");
		String password = scanner.next();
		if(test.checkUser(username, password) == true) {
			System.out.println("��½�ɹ�");
		}else {
			System.out.println("��½ʧ��");
		}
		
	}

}

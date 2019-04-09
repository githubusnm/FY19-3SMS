package com.neuedu.test;

import java.util.Scanner;

public class TestUser {

	public static void main(String[] args) {
		Test2 test = new Test2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入用户名：");
		String username = scanner.next();
		System.out.println("输入密码：");
		String password = scanner.next();
		if(test.checkUser(username, password) == true) {
			System.out.println("登陆成功");
		}else {
			System.out.println("登陆失败");
		}
		
	}

}

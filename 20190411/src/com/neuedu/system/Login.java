package com.neuedu.system;

import java.util.Scanner;

public class Login {

	public void login() {
		System.out.println("。。。。。。。欢迎登录学生信息管理系统。。。。。。");
		System.out.println("1.登录" + "\t" + "2.退出");
		System.out.println(".....................................");
		Scanner scanner = new Scanner(System.in);
		System.out.print("请选择：");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.print("请输入用户名：");
			String mima = "admin";
			if (scanner.next().equals(mima)) {
				System.out.print("请输入密码：");
			} else {
				System.out.println("用户名错误");
				return;
			}
			if (scanner.next().equals(mima)) {
				System.out.println("登录成功");
			} else {
				System.out.println("密码错误");
				return;
			}
			System.out.println("欢迎您：" + mima);
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

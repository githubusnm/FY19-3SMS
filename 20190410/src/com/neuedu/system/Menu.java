package com.neuedu.system;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

	Scanner scanner = new Scanner(System.in);
//	String[] students = new String[] {"3","张三","男","45","高级","北京市昌平区龙旗广场","12345678900","123@qwer.com"};
	int[] students = { 3 };

	public void showMenu() {
		System.out.println("***********请选择要操作的信息对应数字**********************");
		System.out.print("*");

		System.out.print("1.查看学生信息");
		System.out.print("2.添加学生信息");
		System.out.print("3.删除学生信息");
		System.out.print("4.修改学生信息");
		System.out.print("5.退出");

		System.out.println("*");
		System.out.println("**************************************************");
		System.out.print("请选择：");

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
		System.out.println("***************添加学生信息***************");
		System.out.print("请输入学生id:");
		int i = scanner.nextInt();
		if (students[0] == i) {
			System.out.println("此ID" + i + "已存在，请重新输入");
			System.out.print("请输入学生id:");
		}
		System.out.print("请输入学生姓名：");
		scanner.next();
		System.out.print("请输入学生性别：");
		scanner.next();
		System.out.print("请输入学生年龄：(1~120内的数字)");
		int age = scanner.nextInt();
		if (age < 1 || age > 120) {
			return;
		}
		System.out.print("请输入学生所属年级：(只能初级，中级，高级)");
		String[] levels = { "初级", "中级", "高级" };
//		String level = scanner.next();
//		System.out.println(Arrays.toString(levels));
//		System.out.println(level);
//		for (int j = 0; j < levels.length - 1; j++) {
//			if (levels[j].equals(level)) {
//				System.out.print("请输入地址：");
//				scanner.next();
//				String[] phoneNumbers = new String[11];
//				System.out.print("请输入学生联系方式：(11位手机号码)");
//				String phoneNumber = scanner.next();
//				if (phoneNumber.length() != phoneNumbers.length) {
//					return;
//				}
//				System.out.print("请输入学生电子邮箱：(包含@和.com)");
//				scanner.next();
//			}
//
//		}
		
		String str = scanner.next();
		for (String level : levels) {
			if(level.equals(str)) {
				System.out.print("请输入地址：");
				scanner.next();
				String[] phoneNumbers = new String[11];
				System.out.print("请输入学生联系方式：(11位手机号码)");
				String phoneNumber = scanner.next();
				if (phoneNumber.length() != phoneNumbers.length) {
					return;
				}
				System.out.print("请输入学生电子邮箱：(包含@和.com)");
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
		System.out.print("1.根据ID修改学生全部信息");
		System.out.print("2.根据ID修改学生部分信息");
		System.out.print("3.返回上级目录");
		System.out.print("4.系统推出");
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
		System.out.println("数据保存成功！系统将自动返回上层目录~");
		this.showMenu();
	}
}

package com.neuedu.system;

import java.util.Scanner;

public class Change extends Menu {

	Scanner scanner = new Scanner(System.in);
	public void changeByIdAll() {
		System.out.println("**************************************************");
		System.out.print("*");
		System.out.print("1.查看所有学生信息");
		System.out.print("2.根据id查看学生信息");
		System.out.print("3.根据id查看学生姓名");
		System.out.println("4.返回上一层");
		System.out.println("**************************************************");
		System.out.print("请输入：");
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
		System.out.print("请输入要修改的id");
		scanner.nextInt();
		System.out.print("请输入要修改的属性");
		scanner.next();
		System.out.print("请输入要修改后的值");
		scanner.next();
		System.out.println("修改成功");
		this.changeStudent();
		
	}
	public void backLast() {
		System.out.println("系统自动返回上层目录~");
		this.changeStudent();
	}

}

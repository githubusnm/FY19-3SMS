package com.neuedu.system;

import java.util.Scanner;

public class Show extends Menu {
	Scanner scanner = new Scanner(System.in);
	public void showAll() {
		
	}
	public void showById() {
		System.out.print("请选择要查询的ID");
		scanner.nextInt();
		System.out.println("--------------所有学生信息-------------------");
		System.out.println("|学生          |姓名          |年龄          |电话                                  |Email 		     |地址");
		System.out.println("-----------------------------------------");
		System.out.println("|3     |张三          |100   |12345678900   |123@12.com      |北京市昌平区龙旗广场");
		System.out.println("-----------------------------------------");
		System.out.println("数据查询完毕，系统将自动返回目录~");
		this.showStudent();
	}
	public void showByIdName() {
		
	}
}

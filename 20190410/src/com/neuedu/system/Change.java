package com.neuedu.system;

import java.util.Scanner;

public class Change extends Menu {

	Scanner scanner = new Scanner(System.in);
	public void changeByIdAll() {
		System.out.println("请输入要修改的id");
		scanner.nextInt();
		System.out.println("请输入要修改的属性");
		scanner.next();
		System.out.println("修改成功");
		this.changeStudent();
	}
	public void changeByIdPart() {
		
	}
	public void backLast() {
		System.out.println("系统自动返回上层目录~");
		this.changeStudent();
	}

}

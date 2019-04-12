package com.neuedu.system;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {

	static String userName = "admin";
	static String passWord = "admin";
	
	//创建scanner类
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//创建一个客户端
		StudentClient studentclient = new StudentClient();
		studentclient.welcomePage();
	}
	
	//删除一个studentManger对象
	StudentManager sm = new StudentManager(this);
	
	
	//欢迎界面
	public void welcomePage() {
		System.out.println("欢迎登录学生管理系统");
		System.out.println("1.登录                               2.退出");
		System.out.println("******************************************");
		//接受用户输入的1和2
		System.out.println("请选择");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录");
			System.out.println("请输入：");
			String userName = scanner.next();
			System.out.println("请输入密码：");
			String psw = scanner.next();
			Admin admin = new Admin(userName,psw);
			boolean login = login(admin);
			if(login == true) {
				System.out.println("欢迎您"+userName+"登录");
				stuManagerIndex();
			}else {
				System.out.println("登陆失败");
				welcomePage();
			}
			
			break;
		case 2:
			System.out.println("退出！");
			System.exit(0);
			break;
		
		default:
			System.out.println("输入有误");
			welcomePage();
			break;
		}
		
		
	}
	
	
	
	//登录方法
	public boolean login(Admin admin) {
	
		
		//判断传入的数据用户名密码是否一致
		if(userName.equals(admin.username) && passWord.equals(passWord)) {
			return true;
		}else {
			return false;
		}
	}
	//退出系统
	public void exitSystem() {
		System.exit(0);
	}
	
	//学生管理的首页
	public void stuManagerIndex() {
		System.out.println("请选择要操作的信息的数字");
		System.out.println("1.查看学生信息  2.添加学生信息 3.删除学生信息 4.修改学生信息 5.退出");
		System.out.println("**************************");
		System.out.println("请选择");
		//接受输入的选项
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

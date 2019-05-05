package com.neuedu.Manager;

public class Main {

	public static void main(String[] args) {
		System.out.println("欢迎使用管理系统");
		System.out.println("==================");
		StudentView view = new StudentView();
		view.showView();
		CourseView courseView = new CourseView();
		courseView.showView();
		
		
//		for(int i=101;i<=200;i++) {
//			
//		boolean b=false;
//			for(int j=2;j<i;j++) {
//				if(i%j == 0) {
//					b = false;
//					break;
//				}else {
//					b = true;
//				}
//			}
//			if(b==true) 
//				System.out.println(i);
////			else
////				System.out.println(i);
			
		//}
		
	}
}

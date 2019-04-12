package com.neuedu.system;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	StudentClient sc;
	
	public StudentManager() {
		
	}
	
	public StudentManager(StudentClient sc) {
		this.sc = sc;
	}

	// 声明一个学生数组
	static Student[] stus = new Student[0];

	// 声明一个删除后的数组
	static Student[] newStus;
	
	// 添加学生
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length - 1] = student;
	}
	
	//添加学生的假面
	public void addStuPage(Scanner scanner) {
		
		System.out.println("请输入学生id");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名");
		String name = scanner.next();
		
		System.out.println("请输入学生性别");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄");
		Short age = scanner.nextShort();
		
		System.out.println("请输入学生年级");
		String grade = scanner.next();
		System.out.println("请输入学生地址");
		String address = scanner.next();
		
		System.out.println("请输入学生联系方式");
		int tel = scanner.nextInt();
		System.out.println("请输入学生电子邮箱");
		String email = scanner.next();
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student(id, name, sex, age, grade, address, tel, email);
		studentManager.addStudent(student);
		System.out.println("数据保存成功，返回上级目录~");
		sc.stuManagerIndex();
		
	}
	
	
	

	// 根据ID删除学生 缩容
	public Student[] delOneStudentByStuId(int stuId) {

		// 给删除后的数组赋值 赋值的商都为备件之前的源数组的长度-1
		newStus = new Student[stus.length];
		// 遍历数组中的元素
		int j = 0;
		for (int i = 0; i < stus.length; i++) {

			// 判断数组中的学生是否有id为stuid的学生
			if (stuId != stus[i].id) {

				// 把不相等的学生放到数组里
				newStus[j] = stus[i];
				j++;
			}
		}
		return newStus;
	}
	
	//根据id修改学生全部信息
	public void updateStudentInfo(Student student) {
		//找到要修改的学生
		for(int i=0;i<stus.length;i++) {
			if(stus[i].id == student.id) {
				stus[i] = student;
			}
		}
	}
	
	//根据id修改部分信息
	
	
	

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1, "张三", '男', (short) 15, "初级", "天津", 123456789, "456@qq.com");
		studentManager.addStudent(student);
		Student students = new Student(2, "李四", '男', (short) 15, "初级", "天津", 123456789, "456@qq.com");
		studentManager.addStudent(students);

		Student student1 = new Student(3, "王五", '男', (short) 15, "初级", "天津", 123456789, "456@qq.com");
		studentManager.addStudent(student1);
		Student students2 = new Student(4, "赵六", '男', (short) 15, "初级", "天津", 123456789, "456@qq.com");
		studentManager.addStudent(students2);

		studentManager.delOneStudentByStuId(1);
	}

}

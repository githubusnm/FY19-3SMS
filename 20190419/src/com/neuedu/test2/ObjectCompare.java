package com.neuedu.test2;

public class ObjectCompare {

	public static void main(String[] args) {
		
		Student student = new Student("张三",12);
		Student student2 = new Student("张三",12);
		
		System.out.println(student.equals(student2));
		System.out.println(student == student2);
		
		
		
		
	}
}

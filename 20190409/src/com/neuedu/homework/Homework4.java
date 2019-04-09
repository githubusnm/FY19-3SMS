package com.neuedu.homework;

import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		Student student = new Student();
		student.jisuan();
	}
}
class Student{
	String[] names;
	String[] nums;
	int[] grade;
	
	public Student() {
		names = new String[] {"阿珍","阿强","张永超","刘子豪","独立团团长"};
		nums = new String[] {"9525","9526","9527","9528","9529"};
		grade = new int[] {85,77,100,70,86};
	}
	public int[] jisuan() {
		System.out.println(Arrays.toString(grade));
		for(int i=0;i<grade.length-1;i++) {
			for(int j=i+1;j<grade.length;j++) {
				if(grade[i]>grade[j]) {
					int temp = grade[i];
					grade[i] = grade[j];
					grade[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(grade));
		return grade;
	}
	public Student(int x) {
		//Object[][] string = new Object[3][5];
		//string[0][0] = {"阿珍","9525",85};
	}
	public void js() {
		
	}
}
package com.neuedu.homework;

public class Homework3 {

	public static void main(String[] args) {
		Computer computer = new Computer('绿',65423);
		computer.show();
	}
}
class Computer{
	char c;
	int s;
	public Computer() {
		
	}
	public Computer(char c,int s) {
		this.c = c;
		this.s = s;
	}
	public void show() {
		System.out.println("笔记本的颜色是："+this.c+"笔记本的型号是："+this.s);
	}
}
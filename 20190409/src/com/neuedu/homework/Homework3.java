package com.neuedu.homework;

public class Homework3 {

	public static void main(String[] args) {
		Computer computer = new Computer('��',65423);
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
		System.out.println("�ʼǱ�����ɫ�ǣ�"+this.c+"�ʼǱ����ͺ��ǣ�"+this.s);
	}
}
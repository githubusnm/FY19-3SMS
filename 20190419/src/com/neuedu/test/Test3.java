package com.neuedu.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		if (nextLine.equals("ƻ��")) {
			new Apple();
		} else if(nextLine.equals("�㽶")){
			new Banana();
		}else if(nextLine.equals("����")) {
			new Putao();
		}else {
			new Garden();
		}
		

	}
}

class Apple {
	public Apple() {
		System.out.println("������һ��ƻ������");
	}
}

class Banana {
	public Banana() {
		System.out.println("������һ���㽶����");
	}
}

class Putao {
	public Putao() {
		System.out.println("������һ�����Ѷ���");
	}
}

class Garden {
	public Garden() {
		System.out.println("������һ��԰������");
	}
}
package com.neuedu.system;

import java.util.Scanner;

public class Change extends Menu {

	Scanner scanner = new Scanner(System.in);
	public void changeByIdAll() {
		System.out.println("������Ҫ�޸ĵ�id");
		scanner.nextInt();
		System.out.println("������Ҫ�޸ĵ�����");
		scanner.next();
		System.out.println("�޸ĳɹ�");
		this.changeStudent();
	}
	public void changeByIdPart() {
		
	}
	public void backLast() {
		System.out.println("ϵͳ�Զ������ϲ�Ŀ¼~");
		this.changeStudent();
	}

}

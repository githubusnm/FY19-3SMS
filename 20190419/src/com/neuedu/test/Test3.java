package com.neuedu.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		if (nextLine.equals("苹果")) {
			new Apple();
		} else if(nextLine.equals("香蕉")){
			new Banana();
		}else if(nextLine.equals("葡萄")) {
			new Putao();
		}else {
			new Garden();
		}
		

	}
}

class Apple {
	public Apple() {
		System.out.println("创建了一个苹果对象");
	}
}

class Banana {
	public Banana() {
		System.out.println("创建了一个香蕉对象");
	}
}

class Putao {
	public Putao() {
		System.out.println("创建了一个葡萄对象");
	}
}

class Garden {
	public Garden() {
		System.out.println("创建了一个园丁对象");
	}
}
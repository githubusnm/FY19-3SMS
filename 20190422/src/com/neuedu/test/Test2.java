package com.neuedu.test;

public class Test2 {

	public static void main(String[] args) {
		
		int x;
		int y = 10;
		x = y = ++y;
		System.out.println(x+","+y);
	}
}

package com.neuedu.test;

public class Test1 {

	public static void main(String[] args) {
		String[] string = { "person", "people", "human" };
		System.out.println(string+"�ĳ����ǣ�"+string.length);
		Test1 test1 = new Test1();
		int f = test1.f(4);
		System.out.println("4�Ľ׳��ǣ�"+f);
		
		
		
	}
	
	public int f(int i) {
		if(i > 0) {
			i = i * f(i -1);
		}
		else {
			return 1;
		}
		return i;
	}

}

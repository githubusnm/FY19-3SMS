package com.neuedu.test;

public class Test3 {
	public static void main(String[] args) {
		TestOne to = new TestOne();
		System.out.println(to.aMethod());
		int j = to.aMethod();
//		System.out.println(j);
	}
}
class TestOne {
	static int i = 0;
	public int aMethod() {
		i++;
		return i;
	}
}


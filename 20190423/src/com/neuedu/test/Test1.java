package com.neuedu.test;

public class Test1 {

	public static void main(String[] args) {
		
		short s1 = 1;
		s1 = (short) (s1 + 1);
		s1 += 1;
		int b = 100;
		System.out.println((byte)b);
		
		String string = "hello";
		System.out.println(string.equals(new String("hello")));
		
		String string2 = "com.jd.".replaceAll(".", "/")+"MyClass.class";
		//replace��һ��������һ��������ʽ 
		//.����ȫ��
		System.out.println(string2);
		
	}
}

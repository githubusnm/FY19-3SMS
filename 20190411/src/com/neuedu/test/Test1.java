package com.neuedu.test;

public class Test1 {

	int age;
	String type;

	@Override
	public String toString() {

		return type + "品种" + age + "岁的张永超";
	}

	public static void main(String[] args) {
		int a = 99;
		int b = 999;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a + " " + b);
		System.out.println(1 << 3);
		String string = "1@23.com";
		String[] strings = {"@",".com"};
		char c = '@';
		String s = ".com";
//		for (int i = 0; i < string.length(); i++) {
//			for(int j=0;j<s.length();j++) {
//				if (c == string.charAt(0) && s.charAt(j) == string.charAt(i)) {
//					System.out.print("有");
//				}
//			}
//		}
		for (int i = 0; i < string.length(); i++) {
				if (c == string.charAt(i)) {
					if(s.equals((string.substring(string.length()-4, string.length())))){
						System.out.println("有");
					}
				}
		}
		String sss = "123456";
		System.out.println(sss.substring(sss.length()-4));
		System.out.println(sss.substring(sss.length()-4, sss.length()-2));
//		for (String string2 : strings) {
//			if(string2 == string) {
//				System.out.println("有");
//			}
//		}
	}
}

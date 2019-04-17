package com.neuedu.test;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder append = stringBuilder.append("hello");
		System.out.println(append);
		
		char charAt = append.charAt(0);
		System.out.println(charAt);
		
		//����ҿ�  �������ұߵ���
		StringBuilder delete = append.delete(0, 4);
		System.out.println(delete);
		
		//indexOf
		StringBuilder string = stringBuilder.append("hello");
		int indexOf = string.indexOf("l");
		System.out.println(indexOf);
		
		//insert
		StringBuilder insert = string.insert(0, "h");
		System.out.println(insert);
		
		//lastIndexOF()
		int lastIndexOf = string.lastIndexOf("l");
		System.out.println(lastIndexOf);
		
		//replace()
		//��������ҿ�
		StringBuilder replace = string.replace(0, 3, "www.");
		System.out.println(replace);
		
		//reverse ��ת
		StringBuilder reverse = string.reverse();
		System.out.println(reverse);
		
		//substring
		//��������
		String substring = string.substring(5);
		System.out.println(substring);
		
		String string2 = append.toString();
		System.out.println(string2);
		
		
		
	}
	
	
}

package com.neuedu.test;

public class Test3 {

	public static void main(String[] args) {
		
		//���ַ������ָĳ�int
		int parseint = Integer.parseInt("45");
		System.out.println(parseint);
		
		Integer a = 5;
		int b = new Integer(5);
		System.out.println(a == b);
		
		Integer score = null;
		System.out.println(score);
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		/**
		 * �������ͱȽϵ��ǵ�ַ
		 * 127Ϊ�߽�ֵ�������ڳ������У���˿��ԱȽϣ����Ϊtrue
		 */
		i1 = 128;
		i1 = new Integer(128).intValue();
		i2 = 128;
		/**
		 * 128>byte�߽�ֵ���Ƚϵ�ַ�����Ϊfalse
		 */
		System.out.println(i1 == i2);
		
		Double d = 2.9;
		Float f = 3.9f;
		System.out.println(d.intValue());
		System.out.println(f.intValue());
		
		
	}
	
}

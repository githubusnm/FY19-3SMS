package com.neuedu.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

	public static void main(String[] args) {
		Date date = new Date();
		Date date2 =	new Date();
		System.out.println("һ�����������"+date);
		System.out.println("ʱ�����"+date.getTime());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date.getTime());
		System.out.println("��ʽ�����1��"+format);
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		String format2 = simpleDateFormat2.format(date2.getTime());
		System.out.println("��ʽ������0��"+format2);
		
		
	}
}

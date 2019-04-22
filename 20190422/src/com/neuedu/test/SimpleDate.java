package com.neuedu.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

	public static void main(String[] args) {
		Date date = new Date();
		Date date2 =	new Date();
		System.out.println("一般日期输出："+date);
		System.out.println("时间戳："+date.getTime());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date.getTime());
		System.out.println("格式化结果1："+format);
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String format2 = simpleDateFormat2.format(date2.getTime());
		System.out.println("格式化日期0："+format2);
		
		
	}
}

package com.neuedu.test;

public class Test2 {

	public static void main(String[] args) {
		String str = "78945646541313213";
		System.out.println(str.length());
		
		String[] strs = {"1","2"};
		System.out.println(strs.length);
		
		//charAt(int index)
		char charAt = str.charAt(0);
		System.out.println(charAt);
		
		//substring();
		//身份证号 截取年月
		//12313212315454654897987
		String substring = str.substring(6,14);
		System.out.println(substring);
		
		//compareTo
		String str2 = "ABC";
		String str3 = "abc";
		int compareTo = str2.compareTo(str3);
		System.out.println(compareTo);
		
		//拼接字符串
		String concat = str2.concat(str3);
		System.out.println(concat);
		
		//indexOf()
		String str4 = "neuedu";
		int indexof = str4.indexOf("e",2);
		System.out.println(indexof);
		
		//lastIndexOf();
		String str5 = "neuedu";
		int lastIndexof = str5.lastIndexOf("e");
		System.out.println(lastIndexof);
		
		//转大小写
		String upperCase = str5.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		//replace
		String str6 = "neueduofto";
		String replace = str6.replace("o", "1");
		System.out.println(replace);
		
		//trim 去空格
		String str7 = "            456           ";
		String trim = str7.trim();
		System.out.println(str7);
		System.out.println(trim);
		
		//starsWith endsWith
		String str8 = "www.neuedu.cn";
		boolean startsWith = str8.startsWith("www");
		System.out.println(startsWith);
		boolean endsWith = str8.endsWith("org");
		System.out.println(endsWith);
		
		//contains
		String str9 = "I love you girl";
		boolean contains = str9.contains("love");
		System.out.println(contains);
		
		//split
		String str10 = "1,张三,18,天津,津D888";
		String[] split = str10.split(",");
		System.out.println(split[4]);
		
		//equals equalseIgnoreCase
		String str12 = "CSDN";
		String Str13 = "csdn";
		System.out.println(str12.equals(Str13));
		System.out.println(str12.equalsIgnoreCase(Str13));
		
		//
		byte[] bs = new byte[] {65,66};
		String string = new String(bs);
		System.out.println(string);
		
		//将其他类型转为字符串
		String valueof = String.valueOf(1);
		System.out.println(valueof);
		
		
		
		
	}
	
	
	
}

package com.neuedu.test;

public class Test2 {
	public static void main(String[] args) {
		
		boolean a = Marry("9811", 23, false);
		System.out.println(a);
		
		if(Marry("9811", 23, false) == true) {
			System.out.println("我已见证你们互相发誓爱对方,我感到万分喜悦向在坐各位宣布你们为夫妇,现在新郎可以吻新娘了！");
		}else {
			System.out.println("不可以结婚");
		}
		
//		boolean a = Marry("9811", 23, false);
//		System.out.println(a);
//		System.out.println(a);
	}
	public static boolean Marry(String persionName,int persionAge,boolean isMarried) {
		boolean b = false;
		Persion p1 = new Persion();
		Persion p2 = new Persion();
//		persionName = p2.number;
//		persionAge = p2.age;
//		isMarried = p2.isMarried;
		p2.number = persionName;
		p2.age = persionAge;
		p2.isMarried = isMarried;
		if((p1.number != p2.number) && (p1.age>20) && (p2.age>22) && (p1.isMarried == false) && (p2.isMarried == false)) {
			b = true;
		}else {
			b = false;
		}
		
		return b;
	}
}
class Persion{
	String number;
	String name;
	String sexual;
	int age;
	boolean isMarried;
	String idNumber;
	String add;
	String phone;
	boolean iswithsomeone;
	public Persion() {
		number = "9527";
		name = "阿珍";
		sexual = "女";
		age = 30;
		isMarried =false;
		idNumber = "123456789456321456";
		add = "北纬路甲一号";
		phone = "12345678945";
		iswithsomeone = false;
	}
}

package com.neuedu.test;

public class ThisDemo {

	public static void main(String[] args) {
		Money money1 = new Money();
		System.out.println(money1.value+" "+money1.country);
		Money money2 = new Money(500,"霍格沃兹");
		System.out.println(money2.value+" "+money2.country);
		Money money3 = new Money("<h2>格林德沃</h2>");
		System.out.println(money3.value+" "+money3.country);
	}

}
class Money{
	int value;
	String country;
	public Money() {
		value = 100;
		country = "纳尼亚";
	}
	public Money(String country) {
		this(1,country);
	}
	public Money(int value,String country) {
		this.value = value;
		this.country = country;
	}
}
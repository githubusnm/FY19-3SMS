package com.neuedu.homework;

public class Homework5 {

	public static void main(String[] args) {
		Persion persion = new Persion();
		persion.sayHello();
		Persion persion1 = new Persion();
		Persion persion2 = new Persion();
		PersionCreate p1 = new PersionCreate(persion1,persion2);
	}
}
class Persion{
	String name;
	double height;
	double weight;
	int age;
	
	public Persion() {
		name = "阿珍";
	}
	
	public Persion(String name,int age,double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void sayHello() {
		System.out.println("hello,my name is "+name);
	}
}
class PersionCreate{
	Persion p1 = new Persion("张三",33,1.73);
	Persion p2 = new Persion("李四",44,1.74);
	public PersionCreate() {
		
	}
	public PersionCreate(Persion p1,Persion p2) {
		this.p1.sayHello();
		this.p2.sayHello();
	}
//	public void sayHello() {
//		System.out.println("hello,my name is "+p1.name);
//	}
}
package com.neuedu.work;

public class Work2 {

	public static void main(String[] args) {
		Chao chao = new Chao();
		chao.yell();
		System.out.println(false && true);
	}
}
class Dog{
	String name;
	public Dog() {
		name = "������";
	}
	public void yell() {
		System.out.println(name+"��ô�У�"+"\n"+"���");
	}
}
class Chao extends Dog{
	@Override
	public void yell() {
		// TODO Auto-generated method stub
		super.yell();
		
	}
}
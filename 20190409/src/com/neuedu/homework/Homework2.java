package com.neuedu.homework;

public class Homework2 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,2);
		System.out.println("���ε�����ǣ�"+rectangle.getArea());
		System.out.println("���ε��ܳ��ǣ�"+rectangle.getPer());
		rectangle.showAll();
	}
}
class Rectangle{
	int width;
	int length;
	
	public Rectangle() {
		
	}
	public Rectangle(int width,int length) {
			this.width = width;
			this.length = length;
	}
	
	public int getArea() {
		Rectangle p1 = new Rectangle(width,length);
		int area = 0;
		area = p1.width * p1.length;
		return area;
	}
	public int getPer() {
		int lang =0;
		lang = 2 * (width + length);
		return lang;
	}
	public void showAll() {
		Rectangle p1 = new Rectangle(width,length);
		System.out.println("���εĳ��ǣ�"+width+"���εĿ��ǣ�"+length+"\n"+"���ε�����ǣ�"+p1.getArea()+"���ε��ܳ��ǣ�"+p1.getPer());
	}
}
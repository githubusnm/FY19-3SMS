package com.neuedu.test;

public class Test2 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("白色");
		rectangle.setLength(5);
		rectangle.setWidth(5);
		rectangle.showAll();
	}
}
class Rectangle extends Shape{

	private int width;
	private int length;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String string) {
		super(string);
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

	@Override
	double getPer() {
		// TODO Auto-generated method stub
		return 2 * (width + length);
	}

	@Override
	String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void showAll() {
		// TODO Auto-generated method stub
		System.out.println("颜色是：" + color + "\n" + "周长是：" + getPer() + "\n" + "面积是：" + getArea());
	}
	
}
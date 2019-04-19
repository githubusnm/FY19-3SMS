package com.neuedu.test;

public class Circle extends Shape {

	private int r ;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle() {
		
	}
	
	public Circle(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

	@Override
	double getPer() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	String getColor() {
		// TODO Auto-generated method stub
		return super.color;
	}

	@Override
	void showAll() {
		// TODO Auto-generated method stub
		System.out.println("颜色是：" + color + "\n" + "周长是：" + getPer() + "\n" + "面积是：" + getArea());
	}

	public static void main(String[] args) {

		Circle circle = new Circle("黑色");
		circle.setR(5);
		circle.showAll();
	}

}

abstract class Shape {

	double area;
	double per;
	String color;

	abstract double getArea();
	
	abstract double getPer();

	abstract String getColor();

	abstract void showAll();

	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape(String color) {
		this.color = color;
	}

}
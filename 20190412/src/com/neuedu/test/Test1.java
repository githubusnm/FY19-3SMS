package com.neuedu.test;

import java.awt.Point;

public class Test1 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		double circlearea = circle.area();
		System.out.println("圆的面积："+circlearea);
		if(circle.contains(-5, 0) == true) {
			System.out.println("点在圆上");
		}else {
			System.out.println("点在圆外");
		}
		
		Rectangle rectangle = new Rectangle();
		double rectanglearea = rectangle.area();
		System.out.println("矩形的面积："+rectanglearea);
		if(rectangle.contains(0, 4) == true) {
			System.out.println("点在矩形内");
		}else {
			System.out.println("点不在矩形内");
		}
	}
}

class Shape {

	Point p = new Point();
	public Shape() {
		p.x = 0;
		p.y = 0;
	}
	
	public double area() {
		return 0.0;
	}

	public boolean contains(int x,int y) {
		return false;
	}
}

class Circle extends Shape {
	int r;

	@Override
	public double area() {
		r = 5;
		return 3.14 * r * r;
	}
	public boolean contains(int x,int y) {
		double d = Math.sqrt((Math.pow(x, 2)-Math.pow(p.x, 2))+(Math.pow(y, 2)-Math.pow(p.y, 2)));
		System.out.println("圆的半径是："+r+"\n"+"圆心到该点的距离是："+d);
		if(d <= r) {
			return true;
		}
		return false;
	}

}

class Rectangle extends Shape {
	int x;
	int y;
	@Override
	public double area() {
		x=4;
		y=4;
		return x * y;
	}
	@Override
	public boolean contains(int x, int y) {
		if(this.x/2 >= Math.abs(x) && this.y/2 >= Math.abs(y)) {
			return true;
		}
		return false;
	}
}
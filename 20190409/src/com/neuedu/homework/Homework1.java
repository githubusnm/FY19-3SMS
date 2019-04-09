package com.neuedu.homework;

public class Homework1 {
	public static void main(String[] args) {
		Point p = new Point();
		p.movePoint(3, 2);
		Point p1 = new Point();
		p1.movePoint(5, 5);
	}
}
class Point{
	int x;
	int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int x0,int y0) {
		
		
	}
	public void movePoint(int dx,int dy) {
		x += dx;
		y += dy;
		System.out.println("移动后点的坐标是："+x+","+y);
	}
}
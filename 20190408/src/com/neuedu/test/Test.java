package com.neuedu.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.r = 5;
		c.jisuan();
		System.out.println(c.jisuan());
		if(contains(5, 0) <= c.r) {
			System.out.println("这个点在园内");
		}else {
			System.out.println("这个点不在圆上");
		}
		
	}
	public Test() {
		
	}
	public static double contains(int x1,int y1) {
		double dis = 0;
		Circle c = new Circle();
		c.x=0;
		c.y =0;
		dis = Math.sqrt(Math.pow(x1-c.x, 2)+Math.pow(y1-c.y, 2));
		return dis;
	}

}
class Circle {
	int x;
	int y;
	int r;
	double mianji ;
	public double jisuan() {
		mianji = 3.14 * r * r;
		return mianji;
	}
}
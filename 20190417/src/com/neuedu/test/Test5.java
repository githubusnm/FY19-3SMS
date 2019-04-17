package com.neuedu.test;

public class Test5 {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		String[] string = {"a"};
		vehicle.setBrand(string);
		String[] string2 = {"b"};
//		vehicle.setBrand(string2);
		System.out.println(vehicle.getBrand());
		

	}
}

class Vehicle {

	private final String[] brand = {};
	private String color;
	private double speed;


	public String[] getBrand() {
		return brand;
	}

	public void setBrand(String[] brand) {
		this.brand[0] = brand[0];
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
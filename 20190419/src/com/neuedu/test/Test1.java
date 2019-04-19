package com.neuedu.test;

public class Test1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("奔驰", "黄色");
		System.out.println(vehicle);
		vehicle.run();
		Car car = new Car("宝马", "绿色", 2, 0.0);
		System.out.println(car);
		car.run();
	}

}

class Vehicle {
	final String brand;
	final String color;
	private double speed;

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", speed=" + speed + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Vehicle() {
		this.brand = "";
		this.color = "";
	}

	public Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public void run() {
		System.out.println("跑起来贵");
	}
}

class Car extends Vehicle {
	int loader;

	public Car(int loader) {
		this.loader = loader;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + "," + "loader=" + loader + ", speed=" + super.getSpeed() + "]";
	}

	public Car(String brand, String color, int loader, double speed) {
		super(brand, color);
		this.loader = loader;
		super.setSpeed(speed);
	}

	@Override
	public void run() {
		System.out.println("跑起来忒贵");
	}
}
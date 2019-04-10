package com.neuedu.work;

import java.util.Arrays;

public class VechicleTest {

	public static void main(String[] args) {
		Vechicle vechicle = new Vechicle("OOOO","black");
		vechicle.show();
		vechicle.run();
		int[] arr= {2,3,6,5,4,1};
		int[] arrr= {2,3,6,5,4,1};
		//选择
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//冒泡
		for(int i=0;i<arrr.length-1;i++) {
			for(int j=0;j<arrr.length-i-1;j++) {
				if(arrr[j]>arrr[j+1]) {
					int temp = arrr[j];
					arrr[j] = arrr[j+1];
					arrr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrr));
	}
}
class Vechicle{
	 final String brand;
	 private String color;
	 private double speed;
	 
//	 public Vechicle() {
//		
//	}
	 public Vechicle(String brand,String color) {
		 this.speed = 0;
		 this.brand = brand;
		 this.color = color;
	 }
	 public void run() {
		System.out.println("汽车奔跑中"); 
	 }
	 public void show() {
		 System.out.println("汽车的品牌是："+brand+" "+"汽车的颜色是："+color);
	 }
 } 
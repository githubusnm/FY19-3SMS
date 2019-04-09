package com.neuedu.test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		for(int i =0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

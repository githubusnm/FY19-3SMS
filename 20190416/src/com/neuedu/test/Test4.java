package com.neuedu.test;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 1 };
		jisuan(arr);

	}

	public static void jisuan(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int a = (int) Math.pow(arr[i], 2);
			System.out.println(a);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int j = arr[i] * (arr[i] + arr[i + 1]);
			System.out.println(j);
		}

	}

}

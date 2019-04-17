package com.neuedu.test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 1 };
		int i = jisuan(arr);

		System.out.println(i);
		
		
		String str = "a" + "b";
		String string = new String("ab");
		System.out.println(str == string);
		System.out.println(str.equals("ab"));
		
	}

	public static int jisuan(int[] arr) {

		int array[] = new int[6];
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
			array[i] = a;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int j = arr[i] * (arr[i] + arr[i + 1]);
			array[i+arr.length] = j;
		}
		int k = arr[0] * (arr[0]+arr[1]+arr[2]);
		array[array.length-1] = k;

		Arrays.sort(array);
		
		return array[array.length-1];
	}

}

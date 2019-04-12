package com.neuedu.test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		String[] string = new String[5];
		Tes tes = new Tes();
		String[] str = tes.addArray(string);
		System.out.println(Arrays.toString(str));
	}
}

class Tes {
	public String[] addArray(String[] string) {
		string = Arrays.copyOf(string, string.length + 1);
		return string;
	}
}
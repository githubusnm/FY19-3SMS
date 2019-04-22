package com.neuedu.newtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedDemo {

	public static void main(String[] args) {

		File file = new File("c:\\hello\\evening.txt");

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String string = null;
			do {
				System.out.println(string);
				string = bufferedReader.readLine();
//				if(string.equals("向天上啊天")) {
					bufferedReader.skip(1);
//				}else {
					System.out.println(string);
//				}
			} while ((string = bufferedReader.readLine()) != null);
//			while ((string = bufferedReader.readLine()) != null) {
//				if(string.equals("向天上啊天")) {
//					bufferedReader.skip(1);
//					System.out.println(string);
//				}else {
//					System.out.println(string);
//				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}}

package com.neuedu.test;

import java.io.File;
import java.io.FileInputStream;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("C:\\hello\\hello.txt");
		
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			int len = 0;
			String string = null;
			while ((len = fileInputStream.read(buffer)) != -1) {
				string = new String(buffer, 0, len);
			}
			System.out.println(string);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}

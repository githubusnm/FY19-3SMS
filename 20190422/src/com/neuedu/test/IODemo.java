package com.neuedu.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) {
	
		File file = new File("C:\\hello\\hello.txt");
		
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(file);
			String string = "��������һ";
			fileOutputStream.write(string.getBytes());
			System.out.println("�޸ĳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != fileOutputStream) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	
	}
}

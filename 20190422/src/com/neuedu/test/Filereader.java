package com.neuedu.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
		
		File file = new File("C:\\hello\\world.txt");
		try(FileOutputStream fileOutputStream = new FileOutputStream(file);FileReader fileReader = new FileReader(file);) {
			file.createNewFile();
			String string = "忽见天上一火链，好像神仙要抽烟";
			fileOutputStream.write(string.getBytes());
			char[] c = new char[1024];
			int read = fileReader.read(c);
			System.out.println(read);
			String string2 = new String(c, 0, read);
			System.out.println(string2);
			
			System.out.println("DONE");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

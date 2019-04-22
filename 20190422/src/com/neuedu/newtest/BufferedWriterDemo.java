package com.neuedu.newtest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		File file = new File("c:\\hello\\good.txt");

			try(Writer fileWriter = new FileWriter(file);
					BufferedWriter bf = new BufferedWriter(fileWriter)) {
				bf.append('Íí');
				bf.append('°²');
				System.out.println("DONE");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
}

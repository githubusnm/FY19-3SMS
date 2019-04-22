package com.neuedu.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入源文件路径：");
		String src = scanner.nextLine();
		String[] split = src.split("\\.");
		File srcPath = new File(src);
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(srcPath);
			fileOutputStream = new FileOutputStream(split[0]+"-副本."+split[1]);
			int len = 0;
			byte[] buffer = new byte[1];
			while ((len = fileInputStream.read(buffer)) != -1) {
				fileOutputStream.write(buffer, 0, len);
			}
			System.out.println("复制成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fileOutputStream != null ) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fileInputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			scanner.close();
		}
		
		
		
	}
}

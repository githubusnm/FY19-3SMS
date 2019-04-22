package com.neuedu.newtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		File file = new File("c:\\hello\\user.txt");

//		Account account = new Account("Ç¿¶«", "lianmang");
//
//		try(FileOutputStream fileOutputStream = new FileOutputStream(file);
//				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
//			objectOutputStream.writeObject(account);
//			System.out.println("DONE");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			Object readObject = objectInputStream.readObject();
			if(readObject instanceof Account) {
				Account ac = (Account)readObject;
				System.out.println(ac);
			}
			
			System.out.println("DONE");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

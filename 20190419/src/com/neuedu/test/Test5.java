package com.neuedu.test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			mis((byte)0);
		} catch (ByteSizeException e) {
			// TODO Auto-generated catch block
			System.out.println("见到我你就成功了");
		}
	}
	
	public static void mis(byte b) throws ByteSizeException {
		ByteSizeException by =  new ByteSizeException();
		by.exception(b);
	}
	
}
class ByteSizeException extends Exception implements AutoCloseable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void exception(byte b) {
		
	}
	
	
	
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
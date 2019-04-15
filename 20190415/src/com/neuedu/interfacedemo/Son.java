package com.neuedu.interfacedemo;

public class Son extends Father implements Relationshape {

	@Override
	public void say() {
		System.out.println("I'm your SON!!");
	}

	@Override
	public void speak() {
		System.out.println("speak what");
		
	}

}
